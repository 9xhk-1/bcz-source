package org.mozilla.javascript.ast;

import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Node;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FunctionNode extends ScriptNode {
    public static final int FUNCTION_EXPRESSION = 2;
    public static final int FUNCTION_EXPRESSION_STATEMENT = 3;
    public static final int FUNCTION_STATEMENT = 1;
    private static final List<AstNode> NO_PARAMS = Collections.unmodifiableList(new ArrayList());
    private AstNode body;
    private Form functionForm;
    private Name functionName;
    private int functionType;
    private List<Node> generatorResumePoints;
    private boolean isExpressionClosure;
    private boolean isGenerator;
    private Map<Node, int[]> liveLocals;

    /* renamed from: lp, reason: collision with root package name */
    private int f78378lp;
    private AstNode memberExprNode;
    private boolean needsActivation;
    private List<AstNode> params;

    /* renamed from: rp, reason: collision with root package name */
    private int f78379rp;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Form {
        FUNCTION,
        GETTER,
        SETTER
    }

    public FunctionNode() {
        this.functionForm = Form.FUNCTION;
        this.f78378lp = -1;
        this.f78379rp = -1;
        this.type = 109;
    }

    @Override // org.mozilla.javascript.ast.ScriptNode
    public int addFunction(FunctionNode functionNode) {
        int addFunction = super.addFunction(functionNode);
        if (getFunctionCount() > 0) {
            this.needsActivation = true;
        }
        return addFunction;
    }

    public void addLiveLocals(Node node, int[] iArr) {
        if (this.liveLocals == null) {
            this.liveLocals = new HashMap();
        }
        this.liveLocals.put(node, iArr);
    }

    public void addParam(AstNode astNode) {
        assertNotNull(astNode);
        if (this.params == null) {
            this.params = new ArrayList();
        }
        this.params.add(astNode);
        astNode.setParent(this);
    }

    public void addResumptionPoint(Node node) {
        if (this.generatorResumePoints == null) {
            this.generatorResumePoints = new ArrayList();
        }
        this.generatorResumePoints.add(node);
    }

    public AstNode getBody() {
        return this.body;
    }

    public Name getFunctionName() {
        return this.functionName;
    }

    public int getFunctionType() {
        return this.functionType;
    }

    public Map<Node, int[]> getLiveLocals() {
        return this.liveLocals;
    }

    public int getLp() {
        return this.f78378lp;
    }

    public AstNode getMemberExprNode() {
        return this.memberExprNode;
    }

    public String getName() {
        Name name = this.functionName;
        return name != null ? name.getIdentifier() : "";
    }

    public List<AstNode> getParams() {
        List<AstNode> list = this.params;
        return list != null ? list : NO_PARAMS;
    }

    public List<Node> getResumptionPoints() {
        return this.generatorResumePoints;
    }

    public int getRp() {
        return this.f78379rp;
    }

    public boolean isExpressionClosure() {
        return this.isExpressionClosure;
    }

    public boolean isGenerator() {
        return this.isGenerator;
    }

    public boolean isGetter() {
        return this.functionForm == Form.GETTER;
    }

    public boolean isGetterOrSetter() {
        Form form = this.functionForm;
        return form == Form.GETTER || form == Form.SETTER;
    }

    public boolean isParam(AstNode astNode) {
        List<AstNode> list = this.params;
        if (list == null) {
            return false;
        }
        return list.contains(astNode);
    }

    public boolean isSetter() {
        return this.functionForm == Form.SETTER;
    }

    public boolean requiresActivation() {
        return this.needsActivation;
    }

    public void setBody(AstNode astNode) {
        assertNotNull(astNode);
        this.body = astNode;
        if (Boolean.TRUE.equals(astNode.getProp(25))) {
            setIsExpressionClosure(true);
        }
        int position = astNode.getPosition() + astNode.getLength();
        astNode.setParent(this);
        setLength(position - this.position);
        setEncodedSourceBounds(this.position, position);
    }

    public void setFunctionIsGetter() {
        this.functionForm = Form.GETTER;
    }

    public void setFunctionIsSetter() {
        this.functionForm = Form.SETTER;
    }

    public void setFunctionName(Name name) {
        this.functionName = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setFunctionType(int i11) {
        this.functionType = i11;
    }

    public void setIsExpressionClosure(boolean z11) {
        this.isExpressionClosure = z11;
    }

    public void setIsGenerator() {
        this.isGenerator = true;
    }

    public void setLp(int i11) {
        this.f78378lp = i11;
    }

    public void setMemberExprNode(AstNode astNode) {
        this.memberExprNode = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setParams(List<AstNode> list) {
        if (list == null) {
            this.params = null;
            return;
        }
        List<AstNode> list2 = this.params;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<AstNode> it = list.iterator();
        while (it.hasNext()) {
            addParam(it.next());
        }
    }

    public void setParens(int i11, int i12) {
        this.f78378lp = i11;
        this.f78379rp = i12;
    }

    public void setRequiresActivation() {
        this.needsActivation = true;
    }

    public void setRp(int i11) {
        this.f78379rp = i11;
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("function");
        if (this.functionName != null) {
            sb2.append(" ");
            sb2.append(this.functionName.toSource(0));
        }
        if (this.params == null) {
            sb2.append("() ");
        } else {
            sb2.append(j.f81006c);
            printList(this.params, sb2);
            sb2.append(") ");
        }
        if (this.isExpressionClosure) {
            AstNode body = getBody();
            if (body.getLastChild() instanceof ReturnStatement) {
                sb2.append(((ReturnStatement) body.getLastChild()).getReturnValue().toSource(0));
                if (this.functionType == 1) {
                    sb2.append(i.f11097b);
                }
            } else {
                sb2.append(" ");
                sb2.append(body.toSource(0));
            }
        } else {
            sb2.append(getBody().toSource(i11).trim());
        }
        if (this.functionType == 1) {
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.ScriptNode, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (nodeVisitor.visit(this)) {
            Name name = this.functionName;
            if (name != null) {
                name.visit(nodeVisitor);
            }
            Iterator<AstNode> it = getParams().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
            getBody().visit(nodeVisitor);
            if (this.isExpressionClosure || (astNode = this.memberExprNode) == null) {
                return;
            }
            astNode.visit(nodeVisitor);
        }
    }

    public FunctionNode(int i11) {
        super(i11);
        this.functionForm = Form.FUNCTION;
        this.f78378lp = -1;
        this.f78379rp = -1;
        this.type = 109;
    }

    public FunctionNode(int i11, Name name) {
        super(i11);
        this.functionForm = Form.FUNCTION;
        this.f78378lp = -1;
        this.f78379rp = -1;
        this.type = 109;
        setFunctionName(name);
    }
}
