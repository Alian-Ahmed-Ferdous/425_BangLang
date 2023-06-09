// Generated from C:/Users/alian/IdeaProjects/TestGrammar/src\banglang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link banglangParser}.
 */
public interface banglangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link banglangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(banglangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(banglangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(banglangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(banglangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(banglangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(banglangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(banglangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(banglangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(banglangParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(banglangParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipleExpression(banglangParser.MultipleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipleExpression(banglangParser.MultipleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(banglangParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(banglangParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(banglangParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(banglangParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(banglangParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(banglangParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indentiferExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndentiferExpression(banglangParser.IndentiferExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indentiferExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndentiferExpression(banglangParser.IndentiferExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(banglangParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(banglangParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(banglangParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(banglangParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(banglangParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(banglangParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#multipleOperation}.
	 * @param ctx the parse tree
	 */
	void enterMultipleOperation(banglangParser.MultipleOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#multipleOperation}.
	 * @param ctx the parse tree
	 */
	void exitMultipleOperation(banglangParser.MultipleOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#addOperation}.
	 * @param ctx the parse tree
	 */
	void enterAddOperation(banglangParser.AddOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#addOperation}.
	 * @param ctx the parse tree
	 */
	void exitAddOperation(banglangParser.AddOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#conditionOperation}.
	 * @param ctx the parse tree
	 */
	void enterConditionOperation(banglangParser.ConditionOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#conditionOperation}.
	 * @param ctx the parse tree
	 */
	void exitConditionOperation(banglangParser.ConditionOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#booleanOperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperation(banglangParser.BooleanOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#booleanOperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperation(banglangParser.BooleanOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(banglangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(banglangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#ifelseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfelseStatement(banglangParser.IfelseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#ifelseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfelseStatement(banglangParser.IfelseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link banglangParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(banglangParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link banglangParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(banglangParser.WhileLoopContext ctx);
}