import java.util.HashMap;
import java.util.Map;

public class banglangLaunch extends banglangBaseVisitor<Object> {
    Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitAssignment(banglangParser.AssignmentContext context) {

        var varType = context.variable().dataType().getText();
        System.out.println(varType);
        var varName = context.variable().ID().getText();
        System.out.println(varName);
        var varValue = visit(context.expression());
        System.out.println(varValue);

        variables.put(varName, varValue);
        return null;
    }

    @Override
    public Object visitIndentiferExpression(banglangParser.IndentiferExpressionContext context) {
        var varName = context.ID().getText();

        if(!variables.containsKey(varName)){
           String error = "Variable" + varName + "is not defined";
            throw new RuntimeException(error);
        }

        return variables.get(varName);
    }

    @Override
    public Object visitConstant(banglangParser.ConstantContext context) {
        if(context.INT_LITERAL() != null){
            //System.out.println(convertToBanglaNumber(context.INT_LITERAL().getText()));
            return Integer.parseInt(context.INT_LITERAL().getText());}
        if(context.FLOAT_LITERAL() != null)
            return Float.parseFloat(context.FLOAT_LITERAL().getText());
        if(context.STRING_LITERAL() != null)
            return context.STRING_LITERAL().getText().substring(1,context.STRING_LITERAL().getText().length()-1);
        if(context.BOOL_LITERAL() != null){
            System.out.println(context.BOOL_LITERAL().getText());
            return context.BOOL_LITERAL().getText() == "ভুল";}

        return null;
    }

    @Override
    public Object visitMultipleExpression(banglangParser.MultipleExpressionContext context) {
        var left = visit(context.expression(0));
        var right = visit(context.expression(1));
        
        var op = context.multipleOperation().getText();
        switch (op) {
            case "*":
                return Mul(left, right);
            case "/":
                return Div(left, right);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }

    private Object Div(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            int l = (int) left;
            int r = (int) right;
            if (r == 0) {
                throw new ArithmeticException("Division by zero error");
            }
            return l / r;
        }

        if (left instanceof Float && right instanceof Float) {
            float l = (float) left;
            float r = (float) right;
            if (r == 0.0f) {
                throw new ArithmeticException("Division by zero error");
            }
            return l / r;
        }

        if (left instanceof Integer && right instanceof Float) {
            int l = (int) left;
            float r = (float) right;
            if (r == 0.0f) {
                throw new ArithmeticException("Division by zero error");
            }
            return l / r;
        }

        if (left instanceof Float && right instanceof Integer) {
            float l = (float) left;
            int r = (int) right;
            if (r == 0) {
                throw new ArithmeticException("Division by zero error");
            }
            return l / r;
        }

        throw new IllegalArgumentException("Unsupported operand types: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
    }

    private Object Mul(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            int l = (int) left;
            int r = (int) right;
            return l * r;
        }

        if (left instanceof Float && right instanceof Float) {
            float l = (float) left;
            float r = (float) right;
            return l * r;
        }

        if (left instanceof Integer && right instanceof Float) {
            int l = (int) left;
            float r = (float) right;
            return l * r;
        }

        if (left instanceof Float && right instanceof Integer) {
            float l = (float) left;
            int r = (int) right;
            return l * r;
        }

        throw new IllegalArgumentException("Unsupported operand types: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
    }

    @Override
    public Object visitAddExpression(banglangParser.AddExpressionContext context) {
        var left = visit(context.expression(0));
        var right = visit(context.expression(1));

        var op = context.addOperation().getText();
        switch (op) {
            case "+":
                return Add(left, right);
            case "-":
                return Subtract(left, right);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }

    private Object Subtract(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            int l = (int) left;
            int r = (int) right;
            return l - r;
        }

        if (left instanceof Float && right instanceof Float) {
            float l = (float) left;
            float r = (float) right;
            return l - r;
        }

        if (left instanceof Integer && right instanceof Float) {
            int l = (int) left;
            float r = (float) right;
            return l - r;
        }

        if (left instanceof Float && right instanceof Integer) {
            float l = (float) left;
            int r = (int) right;
            return l - r;
        }

        throw new IllegalArgumentException("Unsupported operand types: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
    }

    private Object Add(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            int l = (int) left;
            int r = (int) right;
            return l + r;
        }

        if (left instanceof Float && right instanceof Float) {
            float l = (float) left;
            float r = (float) right;
            return l + r;
        }

        if (left instanceof Integer && right instanceof Float) {
            int l = (int) left;
            float r = (float) right;
            return l + r;
        }

        if (left instanceof Float && right instanceof Integer) {
            int l = (int) left;
            float r = (float) right;
            return l + r;
        }

        if (left instanceof String) {
            String result = (String) left + right;
            return result;
        }
        if (right instanceof String) {
            String result = left + (String) right;
            return result;
        }

        throw new IllegalArgumentException("Unsupported operand types: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
    }

    @Override
    public Object visitConditionExpression(banglangParser.ConditionExpressionContext context) {
        var left = visit(context.expression(0));
        var right = visit(context.expression(1));

        var op = context.conditionOperation().getText();
        switch (op) {
            case "<":
                return less(left, right);
            case ">":
                return greater(left, right);
            case "<=":
                return lessEqual(left,right);
            case ">=":
                return greEqual(left,right);
            case "==":
                return isEqual(left,right);
            case "!=":
                return isNotEqual(left,right);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }

    private Object isNotEqual(Object left, Object right) {
        return null;
    }

    private Object isEqual(Object left, Object right) {
        return null;
    }

    private Object greEqual(Object left, Object right) {
        return null;
    }

    private Object lessEqual(Object left, Object right) {
        return null;
    }

    private Object greater(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            if((int) left > (int) right){
                return true;
            }
            else return false;

        }

        if (left instanceof Float && right instanceof Float) {
            if((float) left > (float) right){
                return true;
            }
            else {
                return false;
            }
        }


            if (left instanceof Integer && right instanceof Float) {
                if( (int) left > (float) right){
                    return true;
                }
                else return false;
            }

        if (left instanceof Float && right instanceof Integer) {
           if ((float) left > (int) right){
               return true;
           }
           else return false;
           }


        throw new IllegalArgumentException("Unsupported operand types: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
    }


    private Object less(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            return (int) left < (int) right;
        }

        if (left instanceof Float && right instanceof Float) {
            return (float) left < (float) right;
        }

        if (left instanceof Integer && right instanceof Float) {
            return (int) left < (float) right;
        }

        if (left instanceof Float && right instanceof Integer) {
            return (float) left < (int) right;
        }

        throw new IllegalArgumentException("Unsupported operand types: " + left.getClass().getSimpleName() + " and " + right.getClass().getSimpleName());
    }

    @Override
    public Object visitWhileLoop(banglangParser.WhileLoopContext content) {
        if (visit(content.expression()) instanceof Boolean){
            do {
                visit(content.statement());
            }while ((boolean) visit(content.expression()));}
        else throw new IllegalArgumentException("Condition statment is not boolean");
        return null;
    }

    @Override
    public Object visitIfelseStatement(banglangParser.IfelseStatementContext context) {
        if(visit(context.ifStatement().expression()) instanceof Boolean){
            if ((boolean) visit(context.ifStatement().expression())){
                visit(context.ifStatement().statement());
            }
            else {
                visit(context.statement());
            }
        }
        else throw new IllegalArgumentException("Condition statment is not boolean");
        return null;
    }

    @Override
    public Object visitIfStatement(banglangParser.IfStatementContext content) {
        if (visit(content.expression()) instanceof Boolean){
            if((boolean)visit(content.expression())) {
                visit(content.statement());
            }
            else{
                visit(content.ifelseStatement().statement());
            }
        }
        else throw new IllegalArgumentException("Condition statment is not boolean");
        return null;
    }
}


