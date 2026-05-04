package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ScriptNode extends Scope {
    private List<FunctionNode> EMPTY_LIST;
    private Object compilerData;
    private String encodedSource;
    private int encodedSourceEnd;
    private int encodedSourceStart;
    private int endLineno;
    private List<FunctionNode> functions;
    private boolean[] isConsts;
    private int paramCount;
    private List<RegExpLiteral> regexps;
    private String sourceName;
    private List<Symbol> symbols;
    private int tempNumber;
    private String[] variableNames;

    public ScriptNode() {
        this.encodedSourceStart = -1;
        this.encodedSourceEnd = -1;
        this.endLineno = -1;
        this.EMPTY_LIST = Collections.EMPTY_LIST;
        this.symbols = new ArrayList(4);
        this.paramCount = 0;
        this.tempNumber = 0;
        this.top = this;
        this.type = 136;
    }

    public int addFunction(FunctionNode functionNode) {
        if (functionNode == null) {
            AstNode.codeBug();
        }
        if (this.functions == null) {
            this.functions = new ArrayList();
        }
        this.functions.add(functionNode);
        return this.functions.size() - 1;
    }

    public void addRegExp(RegExpLiteral regExpLiteral) {
        if (regExpLiteral == null) {
            AstNode.codeBug();
        }
        if (this.regexps == null) {
            this.regexps = new ArrayList();
        }
        this.regexps.add(regExpLiteral);
        regExpLiteral.putIntProp(4, this.regexps.size() - 1);
    }

    public void addSymbol(Symbol symbol) {
        if (this.variableNames != null) {
            AstNode.codeBug();
        }
        if (symbol.getDeclType() == 87) {
            this.paramCount++;
        }
        this.symbols.add(symbol);
    }

    public void flattenSymbolTable(boolean z11) {
        if (!z11) {
            ArrayList arrayList = new ArrayList();
            if (this.symbolTable != null) {
                for (int i11 = 0; i11 < this.symbols.size(); i11++) {
                    Symbol symbol = this.symbols.get(i11);
                    if (symbol.getContainingTable() == this) {
                        arrayList.add(symbol);
                    }
                }
            }
            this.symbols = arrayList;
        }
        this.variableNames = new String[this.symbols.size()];
        this.isConsts = new boolean[this.symbols.size()];
        for (int i12 = 0; i12 < this.symbols.size(); i12++) {
            Symbol symbol2 = this.symbols.get(i12);
            this.variableNames[i12] = symbol2.getName();
            this.isConsts[i12] = symbol2.getDeclType() == 154;
            symbol2.setIndex(i12);
        }
    }

    public int getBaseLineno() {
        return this.lineno;
    }

    public Object getCompilerData() {
        return this.compilerData;
    }

    public String getEncodedSource() {
        return this.encodedSource;
    }

    public int getEncodedSourceEnd() {
        return this.encodedSourceEnd;
    }

    public int getEncodedSourceStart() {
        return this.encodedSourceStart;
    }

    public int getEndLineno() {
        return this.endLineno;
    }

    public int getFunctionCount() {
        List<FunctionNode> list = this.functions;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public FunctionNode getFunctionNode(int i11) {
        return this.functions.get(i11);
    }

    public List<FunctionNode> getFunctions() {
        List<FunctionNode> list = this.functions;
        return list == null ? this.EMPTY_LIST : list;
    }

    public int getIndexForNameNode(Node node) {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        Scope scope = node.getScope();
        Symbol symbol = scope == null ? null : scope.getSymbol(((Name) node).getIdentifier());
        if (symbol == null) {
            return -1;
        }
        return symbol.getIndex();
    }

    public String getNextTempName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i11 = this.tempNumber;
        this.tempNumber = i11 + 1;
        sb2.append(i11);
        return sb2.toString();
    }

    public boolean[] getParamAndVarConst() {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.isConsts;
    }

    public int getParamAndVarCount() {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.symbols.size();
    }

    public String[] getParamAndVarNames() {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.variableNames;
    }

    public int getParamCount() {
        return this.paramCount;
    }

    public String getParamOrVarName(int i11) {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.variableNames[i11];
    }

    public int getRegexpCount() {
        List<RegExpLiteral> list = this.regexps;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getRegexpFlags(int i11) {
        return this.regexps.get(i11).getFlags();
    }

    public String getRegexpString(int i11) {
        return this.regexps.get(i11).getValue();
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public List<Symbol> getSymbols() {
        return this.symbols;
    }

    public void setBaseLineno(int i11) {
        if (i11 < 0 || this.lineno >= 0) {
            AstNode.codeBug();
        }
        this.lineno = i11;
    }

    public void setCompilerData(Object obj) {
        assertNotNull(obj);
        if (this.compilerData != null) {
            throw new IllegalStateException();
        }
        this.compilerData = obj;
    }

    public void setEncodedSource(String str) {
        this.encodedSource = str;
    }

    public void setEncodedSourceBounds(int i11, int i12) {
        this.encodedSourceStart = i11;
        this.encodedSourceEnd = i12;
    }

    public void setEncodedSourceEnd(int i11) {
        this.encodedSourceEnd = i11;
    }

    public void setEncodedSourceStart(int i11) {
        this.encodedSourceStart = i11;
    }

    public void setEndLineno(int i11) {
        if (i11 < 0 || this.endLineno >= 0) {
            AstNode.codeBug();
        }
        this.endLineno = i11;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setSymbols(List<Symbol> list) {
        this.symbols = list;
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Node> it = iterator();
            while (it.hasNext()) {
                ((AstNode) it.next()).visit(nodeVisitor);
            }
        }
    }

    public ScriptNode(int i11) {
        super(i11);
        this.encodedSourceStart = -1;
        this.encodedSourceEnd = -1;
        this.endLineno = -1;
        this.EMPTY_LIST = Collections.EMPTY_LIST;
        this.symbols = new ArrayList(4);
        this.paramCount = 0;
        this.tempNumber = 0;
        this.top = this;
        this.type = 136;
    }
}
