/* Generated By:JJTree: Do not edit this line. ASTSynchronizedStatement.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTSynchronizedStatement extends AbstractJavaNode {
    public ASTSynchronizedStatement(int id) {
        super(id);
    }

    public ASTSynchronizedStatement(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}