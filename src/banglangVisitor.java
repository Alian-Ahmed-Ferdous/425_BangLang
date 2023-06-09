// Generated from C:/Users/alian/IdeaProjects/TestGrammar/src\banglang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link banglangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface banglangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link banglangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(banglangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(banglangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(banglangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(banglangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(banglangParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleExpression(banglangParser.MultipleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(banglangParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(banglangParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(banglangParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indentiferExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndentiferExpression(banglangParser.IndentiferExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(banglangParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link banglangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(banglangParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(banglangParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#multipleOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleOperation(banglangParser.MultipleOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#addOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperation(banglangParser.AddOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#conditionOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOperation(banglangParser.ConditionOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#booleanOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperation(banglangParser.BooleanOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(banglangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#ifelseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseStatement(banglangParser.IfelseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link banglangParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(banglangParser.WhileLoopContext ctx);
}