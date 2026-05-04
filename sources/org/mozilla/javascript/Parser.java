package org.mozilla.javascript;

import ct.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Block;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.DestructuringForm;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.IdeErrorReporter;
import org.mozilla.javascript.ast.IfStatement;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.KeywordLiteral;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.RegExpLiteral;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.StringLiteral;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.Symbol;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.TryStatement;
import org.mozilla.javascript.ast.UnaryExpression;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.VariableInitializer;
import org.mozilla.javascript.ast.WhileLoop;
import org.mozilla.javascript.ast.WithStatement;
import org.mozilla.javascript.ast.XmlDotQuery;
import org.mozilla.javascript.ast.XmlElemRef;
import org.mozilla.javascript.ast.XmlExpression;
import org.mozilla.javascript.ast.XmlLiteral;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.ast.XmlRef;
import org.mozilla.javascript.ast.XmlString;
import org.mozilla.javascript.ast.Yield;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Parser {
    public static final int ARGC_LIMIT = 65536;
    static final int CLEAR_TI_MASK = 65535;
    private static final int GET_ENTRY = 2;
    private static final int PROP_ENTRY = 1;
    private static final int SET_ENTRY = 4;
    static final int TI_AFTER_EOL = 65536;
    static final int TI_CHECK_LABEL = 131072;
    boolean calledByCompileFunction;
    CompilerEnvirons compilerEnv;
    private int currentFlaggedToken;
    private Comment currentJsDocComment;
    private LabeledStatement currentLabel;
    Scope currentScope;
    ScriptNode currentScriptOrFn;
    private int currentToken;
    private int endFlags;
    private IdeErrorReporter errorCollector;
    private ErrorReporter errorReporter;
    private boolean inDestructuringAssignment;
    private boolean inForInit;
    protected boolean inUseStrictDirective;
    private Map<String, LabeledStatement> labelSet;
    private List<Jump> loopAndSwitchSet;
    private List<Loop> loopSet;
    protected int nestingOfFunction;
    private boolean parseFinished;
    private int prevNameTokenLineno;
    private int prevNameTokenStart;
    private String prevNameTokenString;
    private List<Comment> scannedComments;
    private char[] sourceChars;
    private String sourceURI;
    private int syntaxErrorCount;

    /* renamed from: ts, reason: collision with root package name */
    private TokenStream f78367ts;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ConditionData {
        AstNode condition;

        /* renamed from: lp, reason: collision with root package name */
        int f78368lp;

        /* renamed from: rp, reason: collision with root package name */
        int f78369rp;

        private ConditionData() {
            this.f78368lp = -1;
            this.f78369rp = -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ParserException extends RuntimeException {
        static final long serialVersionUID = 5882582646773765630L;

        private ParserException() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class PerFunctionVariables {
        private Scope savedCurrentScope;
        private ScriptNode savedCurrentScriptOrFn;
        private int savedEndFlags;
        private boolean savedInForInit;
        private Map<String, LabeledStatement> savedLabelSet;
        private List<Jump> savedLoopAndSwitchSet;
        private List<Loop> savedLoopSet;

        public PerFunctionVariables(FunctionNode functionNode) {
            this.savedCurrentScriptOrFn = Parser.this.currentScriptOrFn;
            Parser.this.currentScriptOrFn = functionNode;
            this.savedCurrentScope = Parser.this.currentScope;
            Parser.this.currentScope = functionNode;
            this.savedLabelSet = Parser.this.labelSet;
            Parser.this.labelSet = null;
            this.savedLoopSet = Parser.this.loopSet;
            Parser.this.loopSet = null;
            this.savedLoopAndSwitchSet = Parser.this.loopAndSwitchSet;
            Parser.this.loopAndSwitchSet = null;
            this.savedEndFlags = Parser.this.endFlags;
            Parser.this.endFlags = 0;
            this.savedInForInit = Parser.this.inForInit;
            Parser.this.inForInit = false;
        }

        public void restore() {
            Parser parser = Parser.this;
            parser.currentScriptOrFn = this.savedCurrentScriptOrFn;
            parser.currentScope = this.savedCurrentScope;
            parser.labelSet = this.savedLabelSet;
            Parser.this.loopSet = this.savedLoopSet;
            Parser.this.loopAndSwitchSet = this.savedLoopAndSwitchSet;
            Parser.this.endFlags = this.savedEndFlags;
            Parser.this.inForInit = this.savedInForInit;
        }
    }

    public Parser() {
        this(new CompilerEnvirons());
    }

    private AstNode addExpr() throws IOException {
        AstNode mulExpr = mulExpr();
        while (true) {
            int peekToken = peekToken();
            int i11 = this.f78367ts.tokenBeg;
            if (peekToken != 21 && peekToken != 22) {
                return mulExpr;
            }
            consumeToken();
            mulExpr = new InfixExpression(peekToken, mulExpr, mulExpr(), i11);
        }
    }

    private AstNode andExpr() throws IOException {
        AstNode bitOrExpr = bitOrExpr();
        if (!matchToken(105)) {
            return bitOrExpr;
        }
        return new InfixExpression(105, bitOrExpr, andExpr(), this.f78367ts.tokenBeg);
    }

    private List<AstNode> argumentList() throws IOException {
        if (matchToken(88)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.inForInit;
        this.inForInit = false;
        do {
            try {
                if (peekToken() == 72) {
                    reportError("msg.yield.parenthesized");
                }
                AstNode assignExpr = assignExpr();
                if (peekToken() == 119) {
                    try {
                        arrayList.add(generatorExpression(assignExpr, 0, true));
                    } catch (IOException unused) {
                    }
                } else {
                    arrayList.add(assignExpr);
                }
            } catch (Throwable th2) {
                this.inForInit = z11;
                throw th2;
            }
        } while (matchToken(89));
        this.inForInit = z11;
        mustMatchToken(88, "msg.no.paren.arg");
        return arrayList;
    }

    private AstNode arrayComprehension(AstNode astNode, int i11) throws IOException {
        int i12;
        ConditionData conditionData;
        ArrayList arrayList = new ArrayList();
        while (peekToken() == 119) {
            arrayList.add(arrayComprehensionLoop());
        }
        if (peekToken() == 112) {
            consumeToken();
            i12 = this.f78367ts.tokenBeg - i11;
            conditionData = condition();
        } else {
            i12 = -1;
            conditionData = null;
        }
        mustMatchToken(84, "msg.no.bracket.arg");
        ArrayComprehension arrayComprehension = new ArrayComprehension(i11, this.f78367ts.tokenEnd - i11);
        arrayComprehension.setResult(astNode);
        arrayComprehension.setLoops(arrayList);
        if (conditionData != null) {
            arrayComprehension.setIfPosition(i12);
            arrayComprehension.setFilter(conditionData.condition);
            arrayComprehension.setFilterLp(conditionData.f78368lp - i11);
            arrayComprehension.setFilterRp(conditionData.f78369rp - i11);
        }
        return arrayComprehension;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0019, B:9:0x0022, B:11:0x0030, B:12:0x003d, B:14:0x0045, B:15:0x004c, B:21:0x005a, B:22:0x0070, B:24:0x0077, B:25:0x0082, B:27:0x008c, B:28:0x0093, B:30:0x00a1, B:31:0x00a8, B:34:0x00c0, B:42:0x0061, B:43:0x0069, B:45:0x0039), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0019, B:9:0x0022, B:11:0x0030, B:12:0x003d, B:14:0x0045, B:15:0x004c, B:21:0x005a, B:22:0x0070, B:24:0x0077, B:25:0x0082, B:27:0x008c, B:28:0x0093, B:30:0x00a1, B:31:0x00a8, B:34:0x00c0, B:42:0x0061, B:43:0x0069, B:45:0x0039), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0019, B:9:0x0022, B:11:0x0030, B:12:0x003d, B:14:0x0045, B:15:0x004c, B:21:0x005a, B:22:0x0070, B:24:0x0077, B:25:0x0082, B:27:0x008c, B:28:0x0093, B:30:0x00a1, B:31:0x00a8, B:34:0x00c0, B:42:0x0061, B:43:0x0069, B:45:0x0039), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0019, B:9:0x0022, B:11:0x0030, B:12:0x003d, B:14:0x0045, B:15:0x004c, B:21:0x005a, B:22:0x0070, B:24:0x0077, B:25:0x0082, B:27:0x008c, B:28:0x0093, B:30:0x00a1, B:31:0x00a8, B:34:0x00c0, B:42:0x0061, B:43:0x0069, B:45:0x0039), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0019, B:9:0x0022, B:11:0x0030, B:12:0x003d, B:14:0x0045, B:15:0x004c, B:21:0x005a, B:22:0x0070, B:24:0x0077, B:25:0x0082, B:27:0x008c, B:28:0x0093, B:30:0x00a1, B:31:0x00a8, B:34:0x00c0, B:42:0x0061, B:43:0x0069, B:45:0x0039), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.ArrayComprehensionLoop arrayComprehensionLoop() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.nextToken()
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto Lb
            r11.codeBug()
        Lb:
            org.mozilla.javascript.TokenStream r0 = r11.f78367ts
            int r0 = r0.tokenBeg
            org.mozilla.javascript.ast.ArrayComprehensionLoop r1 = new org.mozilla.javascript.ast.ArrayComprehensionLoop
            r1.<init>(r0)
            r11.pushScope(r1)
            r2 = 39
            boolean r3 = r11.matchToken(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "msg.no.paren.for"
            r5 = -1
            if (r3 == 0) goto L3c
            org.mozilla.javascript.TokenStream r3 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r3.getString()     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "each"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L39
            org.mozilla.javascript.TokenStream r3 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            int r3 = r3.tokenBeg     // Catch: java.lang.Throwable -> L36
            int r3 = r3 - r0
            goto L3d
        L36:
            r0 = move-exception
            goto Lca
        L39:
            r11.reportError(r4)     // Catch: java.lang.Throwable -> L36
        L3c:
            r3 = r5
        L3d:
            r6 = 87
            boolean r4 = r11.mustMatchToken(r6, r4)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L4b
            org.mozilla.javascript.TokenStream r4 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            int r4 = r4.tokenBeg     // Catch: java.lang.Throwable -> L36
            int r4 = r4 - r0
            goto L4c
        L4b:
            r4 = r5
        L4c:
            int r6 = r11.peekToken()     // Catch: java.lang.Throwable -> L36
            if (r6 == r2) goto L69
            r7 = 83
            if (r6 == r7) goto L61
            r7 = 85
            if (r6 == r7) goto L61
            java.lang.String r6 = "msg.bad.var"
            r11.reportError(r6)     // Catch: java.lang.Throwable -> L36
            r6 = 0
            goto L70
        L61:
            org.mozilla.javascript.ast.AstNode r6 = r11.destructuringPrimaryExpr()     // Catch: java.lang.Throwable -> L36
            r11.markDestructuring(r6)     // Catch: java.lang.Throwable -> L36
            goto L70
        L69:
            r11.consumeToken()     // Catch: java.lang.Throwable -> L36
            org.mozilla.javascript.ast.Name r6 = r11.createNameNode()     // Catch: java.lang.Throwable -> L36
        L70:
            int r7 = r6.getType()     // Catch: java.lang.Throwable -> L36
            r8 = 1
            if (r7 != r2) goto L82
            org.mozilla.javascript.TokenStream r2 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.getString()     // Catch: java.lang.Throwable -> L36
            r7 = 153(0x99, float:2.14E-43)
            r11.defineSymbol(r7, r2, r8)     // Catch: java.lang.Throwable -> L36
        L82:
            java.lang.String r2 = "msg.in.after.for.name"
            r7 = 52
            boolean r2 = r11.mustMatchToken(r7, r2)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L92
            org.mozilla.javascript.TokenStream r2 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            int r2 = r2.tokenBeg     // Catch: java.lang.Throwable -> L36
            int r2 = r2 - r0
            goto L93
        L92:
            r2 = r5
        L93:
            org.mozilla.javascript.ast.AstNode r7 = r11.expr()     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = "msg.no.paren.for.ctrl"
            r10 = 88
            boolean r9 = r11.mustMatchToken(r10, r9)     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto La7
            org.mozilla.javascript.TokenStream r9 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            int r9 = r9.tokenBeg     // Catch: java.lang.Throwable -> L36
            int r9 = r9 - r0
            goto La8
        La7:
            r9 = r5
        La8:
            org.mozilla.javascript.TokenStream r10 = r11.f78367ts     // Catch: java.lang.Throwable -> L36
            int r10 = r10.tokenEnd     // Catch: java.lang.Throwable -> L36
            int r10 = r10 - r0
            r1.setLength(r10)     // Catch: java.lang.Throwable -> L36
            r1.setIterator(r6)     // Catch: java.lang.Throwable -> L36
            r1.setIteratedObject(r7)     // Catch: java.lang.Throwable -> L36
            r1.setInPosition(r2)     // Catch: java.lang.Throwable -> L36
            r1.setEachPosition(r3)     // Catch: java.lang.Throwable -> L36
            if (r3 == r5) goto Lbf
            goto Lc0
        Lbf:
            r8 = 0
        Lc0:
            r1.setIsForEach(r8)     // Catch: java.lang.Throwable -> L36
            r1.setParens(r4, r9)     // Catch: java.lang.Throwable -> L36
            r11.popScope()
            return r1
        Lca:
            r11.popScope()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.arrayComprehensionLoop():org.mozilla.javascript.ast.ArrayComprehensionLoop");
    }

    private AstNode arrayLiteral() throws IOException {
        if (this.currentToken != 83) {
            codeBug();
        }
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        int i12 = tokenStream.tokenEnd;
        ArrayList arrayList = new ArrayList();
        ArrayLiteral arrayLiteral = new ArrayLiteral(i11);
        int i13 = 0;
        int i14 = -1;
        loop0: while (true) {
            int i15 = 1;
            while (true) {
                int peekToken = peekToken();
                if (peekToken == 89) {
                    consumeToken();
                    i14 = this.f78367ts.tokenEnd;
                    if (i15 == 0) {
                        break;
                    }
                    arrayList.add(new EmptyExpression(this.f78367ts.tokenBeg, 1));
                    i13++;
                } else if (peekToken == 84) {
                    consumeToken();
                    i12 = this.f78367ts.tokenEnd;
                    arrayLiteral.setDestructuringLength(arrayList.size() + i15);
                    arrayLiteral.setSkipCount(i13);
                    if (i14 != -1) {
                        warnTrailingComma(i11, arrayList, i14);
                    }
                } else {
                    if (peekToken == 119 && i15 == 0 && arrayList.size() == 1) {
                        return arrayComprehension((AstNode) arrayList.get(0), i11);
                    }
                    if (peekToken == 0) {
                        reportError("msg.no.bracket.arg");
                        break loop0;
                    }
                    if (i15 == 0) {
                        reportError("msg.no.bracket.arg");
                    }
                    arrayList.add(assignExpr());
                    i15 = 0;
                    i14 = -1;
                }
            }
        }
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayLiteral.addElement((AstNode) it.next());
        }
        arrayLiteral.setLength(i12 - i11);
        return arrayLiteral;
    }

    private AstNode assignExpr() throws IOException {
        int peekToken = peekToken();
        if (peekToken == 72) {
            return returnOrYield(peekToken, true);
        }
        AstNode condExpr = condExpr();
        int peekToken2 = peekToken();
        if (90 > peekToken2 || peekToken2 > 101) {
            if (peekToken2 == 82 && this.currentJsDocComment != null) {
                condExpr.setJsDocNode(getAndResetJsDoc());
            }
            return condExpr;
        }
        consumeToken();
        Comment andResetJsDoc = getAndResetJsDoc();
        markDestructuring(condExpr);
        Assignment assignment = new Assignment(peekToken2, condExpr, assignExpr(), this.f78367ts.tokenBeg);
        if (andResetJsDoc != null) {
            assignment.setJsDocNode(andResetJsDoc);
        }
        return assignment;
    }

    private AstNode attributeAccess() throws IOException {
        int nextToken = nextToken();
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        if (nextToken == 23) {
            saveNameTokenData(i11, "*", tokenStream.lineno);
            return propertyName(i11, "*", 0);
        }
        if (nextToken == 39) {
            return propertyName(i11, tokenStream.getString(), 0);
        }
        if (nextToken == 83) {
            return xmlElemRef(i11, null, -1);
        }
        reportError("msg.no.name.after.xmlAttr");
        return makeErrorNode();
    }

    private void autoInsertSemicolon(AstNode astNode) throws IOException {
        int peekFlaggedToken = peekFlaggedToken();
        int position = astNode.getPosition();
        int i11 = 65535 & peekFlaggedToken;
        if (i11 != -1 && i11 != 0) {
            if (i11 == 82) {
                consumeToken();
                astNode.setLength(this.f78367ts.tokenEnd - position);
                return;
            } else if (i11 != 86) {
                if ((peekFlaggedToken & 65536) == 0) {
                    reportError("msg.no.semi.stmt");
                    return;
                } else {
                    warnMissingSemi(position, nodeEnd(astNode));
                    return;
                }
            }
        }
        warnMissingSemi(position, nodeEnd(astNode));
    }

    private AstNode bitAndExpr() throws IOException {
        AstNode eqExpr = eqExpr();
        while (matchToken(11)) {
            eqExpr = new InfixExpression(11, eqExpr, eqExpr(), this.f78367ts.tokenBeg);
        }
        return eqExpr;
    }

    private AstNode bitOrExpr() throws IOException {
        AstNode bitXorExpr = bitXorExpr();
        while (matchToken(9)) {
            bitXorExpr = new InfixExpression(9, bitXorExpr, bitXorExpr(), this.f78367ts.tokenBeg);
        }
        return bitXorExpr;
    }

    private AstNode bitXorExpr() throws IOException {
        AstNode bitAndExpr = bitAndExpr();
        while (matchToken(10)) {
            bitAndExpr = new InfixExpression(10, bitAndExpr, bitAndExpr(), this.f78367ts.tokenBeg);
        }
        return bitAndExpr;
    }

    private AstNode block() throws IOException {
        if (this.currentToken != 85) {
            codeBug();
        }
        consumeToken();
        int i11 = this.f78367ts.tokenBeg;
        Scope scope = new Scope(i11);
        scope.setLineno(this.f78367ts.lineno);
        pushScope(scope);
        try {
            statements(scope);
            mustMatchToken(86, "msg.no.brace.block");
            scope.setLength(this.f78367ts.tokenEnd - i11);
            return scope;
        } finally {
            popScope();
        }
    }

    private BreakStatement breakStatement() throws IOException {
        int i11;
        Name name;
        if (this.currentToken != 120) {
            codeBug();
        }
        consumeToken();
        TokenStream tokenStream = this.f78367ts;
        int i12 = tokenStream.lineno;
        int i13 = tokenStream.tokenBeg;
        int i14 = tokenStream.tokenEnd;
        if (peekTokenOrEOL() == 39) {
            name = createNameNode();
            i11 = getNodeEnd(name);
        } else {
            i11 = i14;
            name = null;
        }
        LabeledStatement matchJumpLabelName = matchJumpLabelName();
        Jump firstLabel = matchJumpLabelName != null ? matchJumpLabelName.getFirstLabel() : null;
        if (firstLabel == null && name == null) {
            List<Jump> list = this.loopAndSwitchSet;
            if (list != null && list.size() != 0) {
                firstLabel = this.loopAndSwitchSet.get(r4.size() - 1);
            } else if (name == null) {
                reportError("msg.bad.break", i13, i11 - i13);
            }
        }
        BreakStatement breakStatement = new BreakStatement(i13, i11 - i13);
        breakStatement.setBreakLabel(name);
        if (firstLabel != null) {
            breakStatement.setBreakTarget(firstLabel);
        }
        breakStatement.setLineno(i12);
        return breakStatement;
    }

    private void checkBadIncDec(UnaryExpression unaryExpression) {
        int type = removeParens(unaryExpression.getOperand()).getType();
        if (type == 39 || type == 33 || type == 36 || type == 67 || type == 38) {
            return;
        }
        reportError(unaryExpression.getType() == 106 ? "msg.bad.incr" : "msg.bad.decr");
    }

    private void checkCallRequiresActivation(AstNode astNode) {
        if ((astNode.getType() == 39 && "eval".equals(((Name) astNode).getIdentifier())) || (astNode.getType() == 33 && "eval".equals(((PropertyGet) astNode).getProperty().getIdentifier()))) {
            setRequiresActivation();
        }
    }

    private RuntimeException codeBug() throws RuntimeException {
        throw Kit.codeBug("ts.cursor=" + this.f78367ts.cursor + ", ts.tokenBeg=" + this.f78367ts.tokenBeg + ", currentToken=" + this.currentToken);
    }

    private AstNode condExpr() throws IOException {
        AstNode orExpr = orExpr();
        if (!matchToken(102)) {
            return orExpr;
        }
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.lineno;
        int i12 = tokenStream.tokenBeg;
        AstNode assignExpr = assignExpr();
        int i13 = mustMatchToken(103, "msg.no.colon.cond") ? this.f78367ts.tokenBeg : -1;
        AstNode assignExpr2 = assignExpr();
        int position = orExpr.getPosition();
        ConditionalExpression conditionalExpression = new ConditionalExpression(position, getNodeEnd(assignExpr2) - position);
        conditionalExpression.setLineno(i11);
        conditionalExpression.setTestExpression(orExpr);
        conditionalExpression.setTrueExpression(assignExpr);
        conditionalExpression.setFalseExpression(assignExpr2);
        conditionalExpression.setQuestionMarkPosition(i12 - position);
        conditionalExpression.setColonPosition(i13 - position);
        return conditionalExpression;
    }

    private ConditionData condition() throws IOException {
        ConditionData conditionData = new ConditionData();
        if (mustMatchToken(87, "msg.no.paren.cond")) {
            conditionData.f78368lp = this.f78367ts.tokenBeg;
        }
        conditionData.condition = expr();
        if (mustMatchToken(88, "msg.no.paren.after.cond")) {
            conditionData.f78369rp = this.f78367ts.tokenBeg;
        }
        AstNode astNode = conditionData.condition;
        if (astNode instanceof Assignment) {
            addStrictWarning("msg.equal.as.assign", "", astNode.getPosition(), conditionData.condition.getLength());
        }
        return conditionData;
    }

    private void consumeToken() {
        this.currentFlaggedToken = 0;
    }

    private ContinueStatement continueStatement() throws IOException {
        int i11;
        Name name;
        if (this.currentToken != 121) {
            codeBug();
        }
        consumeToken();
        TokenStream tokenStream = this.f78367ts;
        int i12 = tokenStream.lineno;
        int i13 = tokenStream.tokenBeg;
        int i14 = tokenStream.tokenEnd;
        Loop loop = null;
        if (peekTokenOrEOL() == 39) {
            name = createNameNode();
            i11 = getNodeEnd(name);
        } else {
            i11 = i14;
            name = null;
        }
        LabeledStatement matchJumpLabelName = matchJumpLabelName();
        if (matchJumpLabelName == null && name == null) {
            List<Loop> list = this.loopSet;
            if (list == null || list.size() == 0) {
                reportError("msg.continue.outside");
            } else {
                loop = this.loopSet.get(r4.size() - 1);
            }
        } else {
            if (matchJumpLabelName == null || !(matchJumpLabelName.getStatement() instanceof Loop)) {
                reportError("msg.continue.nonloop", i13, i11 - i13);
            }
            if (matchJumpLabelName != null) {
                loop = (Loop) matchJumpLabelName.getStatement();
            }
        }
        ContinueStatement continueStatement = new ContinueStatement(i13, i11 - i13);
        if (loop != null) {
            continueStatement.setTarget(loop);
        }
        continueStatement.setLabel(name);
        continueStatement.setLineno(i12);
        return continueStatement;
    }

    private Name createNameNode() {
        return createNameNode(false, 39);
    }

    private StringLiteral createStringLiteral() {
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        StringLiteral stringLiteral = new StringLiteral(i11, tokenStream.tokenEnd - i11);
        stringLiteral.setLineno(this.f78367ts.lineno);
        stringLiteral.setValue(this.f78367ts.getString());
        stringLiteral.setQuoteCharacter(this.f78367ts.getQuoteChar());
        return stringLiteral;
    }

    private AstNode defaultXmlNamespace() throws IOException {
        if (this.currentToken != 116) {
            codeBug();
        }
        consumeToken();
        mustHaveXML();
        setRequiresActivation();
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.lineno;
        int i12 = tokenStream.tokenBeg;
        if (!matchToken(39) || !"xml".equals(this.f78367ts.getString())) {
            reportError("msg.bad.namespace");
        }
        if (!matchToken(39) || !"namespace".equals(this.f78367ts.getString())) {
            reportError("msg.bad.namespace");
        }
        if (!matchToken(90)) {
            reportError("msg.bad.namespace");
        }
        AstNode expr = expr();
        UnaryExpression unaryExpression = new UnaryExpression(i12, getNodeEnd(expr) - i12);
        unaryExpression.setOperator(74);
        unaryExpression.setOperand(expr);
        unaryExpression.setLineno(i11);
        return new ExpressionStatement((AstNode) unaryExpression, true);
    }

    private AstNode destructuringPrimaryExpr() throws IOException, ParserException {
        try {
            this.inDestructuringAssignment = true;
            return primaryExpr();
        } finally {
            this.inDestructuringAssignment = false;
        }
    }

    private DoLoop doLoop() throws IOException {
        if (this.currentToken != 118) {
            codeBug();
        }
        consumeToken();
        int i11 = this.f78367ts.tokenBeg;
        DoLoop doLoop = new DoLoop(i11);
        doLoop.setLineno(this.f78367ts.lineno);
        enterLoop(doLoop);
        try {
            AstNode statement = statement();
            mustMatchToken(117, "msg.no.while.do");
            doLoop.setWhilePosition(this.f78367ts.tokenBeg - i11);
            ConditionData condition = condition();
            doLoop.setCondition(condition.condition);
            doLoop.setParens(condition.f78368lp - i11, condition.f78369rp - i11);
            int nodeEnd = getNodeEnd(statement);
            doLoop.setBody(statement);
            exitLoop();
            if (matchToken(82)) {
                nodeEnd = this.f78367ts.tokenEnd;
            }
            doLoop.setLength(nodeEnd - i11);
            return doLoop;
        } catch (Throwable th2) {
            exitLoop();
            throw th2;
        }
    }

    private void enterLoop(Loop loop) {
        if (this.loopSet == null) {
            this.loopSet = new ArrayList();
        }
        this.loopSet.add(loop);
        if (this.loopAndSwitchSet == null) {
            this.loopAndSwitchSet = new ArrayList();
        }
        this.loopAndSwitchSet.add(loop);
        pushScope(loop);
        LabeledStatement labeledStatement = this.currentLabel;
        if (labeledStatement != null) {
            labeledStatement.setStatement(loop);
            this.currentLabel.getFirstLabel().setLoop(loop);
            loop.setRelative(-this.currentLabel.getPosition());
        }
    }

    private void enterSwitch(SwitchStatement switchStatement) {
        if (this.loopAndSwitchSet == null) {
            this.loopAndSwitchSet = new ArrayList();
        }
        this.loopAndSwitchSet.add(switchStatement);
    }

    private AstNode eqExpr() throws IOException {
        AstNode relExpr = relExpr();
        while (true) {
            int peekToken = peekToken();
            int i11 = this.f78367ts.tokenBeg;
            if (peekToken != 12 && peekToken != 13 && peekToken != 46 && peekToken != 47) {
                return relExpr;
            }
            consumeToken();
            if (this.compilerEnv.getLanguageVersion() == 120) {
                if (peekToken == 12) {
                    peekToken = 46;
                } else if (peekToken == 13) {
                    peekToken = 47;
                }
            }
            relExpr = new InfixExpression(peekToken, relExpr, relExpr(), i11);
        }
    }

    private void exitLoop() {
        Loop remove = this.loopSet.remove(r0.size() - 1);
        this.loopAndSwitchSet.remove(r1.size() - 1);
        if (remove.getParent() != null) {
            remove.setRelative(remove.getParent().getPosition());
        }
        popScope();
    }

    private void exitSwitch() {
        this.loopAndSwitchSet.remove(r0.size() - 1);
    }

    private AstNode expr() throws IOException {
        AstNode assignExpr = assignExpr();
        int position = assignExpr.getPosition();
        while (matchToken(89)) {
            int i11 = this.f78367ts.tokenBeg;
            if (this.compilerEnv.isStrictMode() && !assignExpr.hasSideEffects()) {
                addStrictWarning("msg.no.side.effects", "", position, nodeEnd(assignExpr) - position);
            }
            if (peekToken() == 72) {
                reportError("msg.yield.parenthesized");
            }
            assignExpr = new InfixExpression(89, assignExpr, assignExpr(), i11);
        }
        return assignExpr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x001c, B:9:0x0027, B:11:0x0035, B:12:0x0044, B:14:0x004c, B:15:0x0053, B:17:0x0065, B:18:0x00ba, B:20:0x00c2, B:22:0x00c9, B:24:0x00d2, B:26:0x00df, B:27:0x00e4, B:28:0x0102, B:31:0x011c, B:40:0x012e, B:41:0x0131, B:42:0x00f4, B:43:0x0074, B:45:0x0081, B:46:0x0096, B:48:0x00a5, B:50:0x00b4, B:51:0x0092, B:53:0x003f, B:30:0x010d), top: B:5:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x001c, B:9:0x0027, B:11:0x0035, B:12:0x0044, B:14:0x004c, B:15:0x0053, B:17:0x0065, B:18:0x00ba, B:20:0x00c2, B:22:0x00c9, B:24:0x00d2, B:26:0x00df, B:27:0x00e4, B:28:0x0102, B:31:0x011c, B:40:0x012e, B:41:0x0131, B:42:0x00f4, B:43:0x0074, B:45:0x0081, B:46:0x0096, B:48:0x00a5, B:50:0x00b4, B:51:0x0092, B:53:0x003f, B:30:0x010d), top: B:5:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x001c, B:9:0x0027, B:11:0x0035, B:12:0x0044, B:14:0x004c, B:15:0x0053, B:17:0x0065, B:18:0x00ba, B:20:0x00c2, B:22:0x00c9, B:24:0x00d2, B:26:0x00df, B:27:0x00e4, B:28:0x0102, B:31:0x011c, B:40:0x012e, B:41:0x0131, B:42:0x00f4, B:43:0x0074, B:45:0x0081, B:46:0x0096, B:48:0x00a5, B:50:0x00b4, B:51:0x0092, B:53:0x003f, B:30:0x010d), top: B:5:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x001c, B:9:0x0027, B:11:0x0035, B:12:0x0044, B:14:0x004c, B:15:0x0053, B:17:0x0065, B:18:0x00ba, B:20:0x00c2, B:22:0x00c9, B:24:0x00d2, B:26:0x00df, B:27:0x00e4, B:28:0x0102, B:31:0x011c, B:40:0x012e, B:41:0x0131, B:42:0x00f4, B:43:0x0074, B:45:0x0081, B:46:0x0096, B:48:0x00a5, B:50:0x00b4, B:51:0x0092, B:53:0x003f, B:30:0x010d), top: B:5:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x001c, B:9:0x0027, B:11:0x0035, B:12:0x0044, B:14:0x004c, B:15:0x0053, B:17:0x0065, B:18:0x00ba, B:20:0x00c2, B:22:0x00c9, B:24:0x00d2, B:26:0x00df, B:27:0x00e4, B:28:0x0102, B:31:0x011c, B:40:0x012e, B:41:0x0131, B:42:0x00f4, B:43:0x0074, B:45:0x0081, B:46:0x0096, B:48:0x00a5, B:50:0x00b4, B:51:0x0092, B:53:0x003f, B:30:0x010d), top: B:5:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:6:0x001c, B:9:0x0027, B:11:0x0035, B:12:0x0044, B:14:0x004c, B:15:0x0053, B:17:0x0065, B:18:0x00ba, B:20:0x00c2, B:22:0x00c9, B:24:0x00d2, B:26:0x00df, B:27:0x00e4, B:28:0x0102, B:31:0x011c, B:40:0x012e, B:41:0x0131, B:42:0x00f4, B:43:0x0074, B:45:0x0081, B:46:0x0096, B:48:0x00a5, B:50:0x00b4, B:51:0x0092, B:53:0x003f, B:30:0x010d), top: B:5:0x001c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.Loop forLoop() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.forLoop():org.mozilla.javascript.ast.Loop");
    }

    private AstNode forLoopInit(int i11) throws IOException {
        AstNode variables;
        try {
            this.inForInit = true;
            if (i11 == 82) {
                variables = new EmptyExpression(this.f78367ts.tokenBeg, 1);
                variables.setLineno(this.f78367ts.lineno);
            } else {
                if (i11 != 122 && i11 != 153) {
                    variables = expr();
                    markDestructuring(variables);
                }
                consumeToken();
                variables = variables(i11, this.f78367ts.tokenBeg, false);
            }
            this.inForInit = false;
            return variables;
        } catch (Throwable th2) {
            this.inForInit = false;
            throw th2;
        }
    }

    private FunctionNode function(int i11) throws IOException {
        Name name;
        TokenStream tokenStream = this.f78367ts;
        int i12 = tokenStream.lineno;
        int i13 = tokenStream.tokenBeg;
        AstNode astNode = null;
        if (matchToken(39)) {
            name = createNameNode(true, 39);
            if (this.inUseStrictDirective) {
                String identifier = name.getIdentifier();
                if ("eval".equals(identifier) || "arguments".equals(identifier)) {
                    reportError("msg.bad.id.strict", identifier);
                }
            }
            if (!matchToken(87)) {
                if (this.compilerEnv.isAllowMemberExprAsFunctionName()) {
                    astNode = memberExprTail(false, name);
                    name = null;
                }
                mustMatchToken(87, "msg.no.paren.parms");
            }
        } else if (matchToken(87)) {
            name = null;
        } else {
            AstNode memberExpr = this.compilerEnv.isAllowMemberExprAsFunctionName() ? memberExpr(false) : null;
            mustMatchToken(87, "msg.no.paren.parms");
            astNode = memberExpr;
            name = null;
        }
        int i14 = this.currentToken == 87 ? this.f78367ts.tokenBeg : -1;
        if ((astNode != null ? 2 : i11) != 2 && name != null && name.length() > 0) {
            defineSymbol(109, name.getIdentifier());
        }
        FunctionNode functionNode = new FunctionNode(i13, name);
        functionNode.setFunctionType(i11);
        if (i14 != -1) {
            functionNode.setLp(i14 - i13);
        }
        functionNode.setJsDocNode(getAndResetJsDoc());
        PerFunctionVariables perFunctionVariables = new PerFunctionVariables(functionNode);
        try {
            parseFunctionParams(functionNode);
            functionNode.setBody(parseFunctionBody());
            functionNode.setEncodedSourceBounds(i13, this.f78367ts.tokenEnd);
            functionNode.setLength(this.f78367ts.tokenEnd - i13);
            if (this.compilerEnv.isStrictMode() && !functionNode.getBody().hasConsistentReturnUsage()) {
                addStrictWarning((name == null || name.length() <= 0) ? "msg.anon.no.return.value" : "msg.no.return.value", name == null ? "" : name.getIdentifier());
            }
            perFunctionVariables.restore();
            if (astNode != null) {
                Kit.codeBug();
                functionNode.setMemberExprNode(astNode);
            }
            functionNode.setSourceName(this.sourceURI);
            functionNode.setBaseLineno(i12);
            functionNode.setEndLineno(this.f78367ts.lineno);
            if (this.compilerEnv.isIdeMode()) {
                functionNode.setParentScope(this.currentScope);
            }
            return functionNode;
        } catch (Throwable th2) {
            perFunctionVariables.restore();
            throw th2;
        }
    }

    private AstNode generatorExpression(AstNode astNode, int i11) throws IOException {
        return generatorExpression(astNode, i11, false);
    }

    private GeneratorExpressionLoop generatorExpressionLoop() throws IOException {
        AstNode createNameNode;
        if (nextToken() != 119) {
            codeBug();
        }
        int i11 = this.f78367ts.tokenBeg;
        GeneratorExpressionLoop generatorExpressionLoop = new GeneratorExpressionLoop(i11);
        pushScope(generatorExpressionLoop);
        try {
            int i12 = mustMatchToken(87, "msg.no.paren.for") ? this.f78367ts.tokenBeg - i11 : -1;
            int peekToken = peekToken();
            if (peekToken == 39) {
                consumeToken();
                createNameNode = createNameNode();
            } else if (peekToken == 83 || peekToken == 85) {
                createNameNode = destructuringPrimaryExpr();
                markDestructuring(createNameNode);
            } else {
                reportError("msg.bad.var");
                createNameNode = null;
            }
            if (createNameNode.getType() == 39) {
                defineSymbol(153, this.f78367ts.getString(), true);
            }
            int i13 = mustMatchToken(52, "msg.in.after.for.name") ? this.f78367ts.tokenBeg - i11 : -1;
            AstNode expr = expr();
            int i14 = mustMatchToken(88, "msg.no.paren.for.ctrl") ? this.f78367ts.tokenBeg - i11 : -1;
            generatorExpressionLoop.setLength(this.f78367ts.tokenEnd - i11);
            generatorExpressionLoop.setIterator(createNameNode);
            generatorExpressionLoop.setIteratedObject(expr);
            generatorExpressionLoop.setInPosition(i13);
            generatorExpressionLoop.setParens(i12, i14);
            popScope();
            return generatorExpressionLoop;
        } catch (Throwable th2) {
            popScope();
            throw th2;
        }
    }

    private Comment getAndResetJsDoc() {
        Comment comment = this.currentJsDocComment;
        this.currentJsDocComment = null;
        return comment;
    }

    private String getDirective(AstNode astNode) {
        if (!(astNode instanceof ExpressionStatement)) {
            return null;
        }
        AstNode expression = ((ExpressionStatement) astNode).getExpression();
        if (expression instanceof StringLiteral) {
            return ((StringLiteral) expression).getValue();
        }
        return null;
    }

    private int getNodeEnd(AstNode astNode) {
        return astNode.getPosition() + astNode.getLength();
    }

    private int getNumberOfEols(String str) {
        int i11 = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == '\n') {
                i11++;
            }
        }
        return i11;
    }

    private ObjectProperty getterSetterProperty(int i11, AstNode astNode, boolean z11) throws IOException {
        FunctionNode function = function(2);
        Name functionName = function.getFunctionName();
        if (functionName != null && functionName.length() != 0) {
            reportError("msg.bad.prop");
        }
        ObjectProperty objectProperty = new ObjectProperty(i11);
        if (z11) {
            objectProperty.setIsGetter();
        } else {
            objectProperty.setIsSetter();
        }
        int nodeEnd = getNodeEnd(function);
        objectProperty.setLeft(astNode);
        objectProperty.setRight(function);
        objectProperty.setLength(nodeEnd - i11);
        return objectProperty;
    }

    private IfStatement ifStatement() throws IOException {
        int i11;
        AstNode astNode;
        if (this.currentToken != 112) {
            codeBug();
        }
        consumeToken();
        TokenStream tokenStream = this.f78367ts;
        int i12 = tokenStream.tokenBeg;
        int i13 = tokenStream.lineno;
        ConditionData condition = condition();
        AstNode statement = statement();
        if (matchToken(113)) {
            i11 = this.f78367ts.tokenBeg - i12;
            astNode = statement();
        } else {
            i11 = -1;
            astNode = null;
        }
        IfStatement ifStatement = new IfStatement(i12, getNodeEnd(astNode != null ? astNode : statement) - i12);
        ifStatement.setCondition(condition.condition);
        ifStatement.setParens(condition.f78368lp - i12, condition.f78369rp - i12);
        ifStatement.setThenPart(statement);
        ifStatement.setElsePart(astNode);
        ifStatement.setElsePosition(i11);
        ifStatement.setLineno(i13);
        return ifStatement;
    }

    private AstNode let(boolean z11, int i11) throws IOException {
        LetNode letNode = new LetNode(i11);
        letNode.setLineno(this.f78367ts.lineno);
        if (mustMatchToken(87, "msg.no.paren.after.let")) {
            letNode.setLp(this.f78367ts.tokenBeg - i11);
        }
        pushScope(letNode);
        try {
            letNode.setVariables(variables(153, this.f78367ts.tokenBeg, z11));
            if (mustMatchToken(88, "msg.no.paren.let")) {
                letNode.setRp(this.f78367ts.tokenBeg - i11);
            }
            if (z11 && peekToken() == 85) {
                consumeToken();
                int i12 = this.f78367ts.tokenBeg;
                AstNode statements = statements();
                mustMatchToken(86, "msg.no.curly.let");
                statements.setLength(this.f78367ts.tokenEnd - i12);
                letNode.setLength(this.f78367ts.tokenEnd - i11);
                letNode.setBody(statements);
                letNode.setType(153);
            } else {
                AstNode expr = expr();
                letNode.setLength(getNodeEnd(expr) - i11);
                letNode.setBody(expr);
                if (z11) {
                    ExpressionStatement expressionStatement = new ExpressionStatement(letNode, !insideFunction());
                    expressionStatement.setLineno(letNode.getLineno());
                    popScope();
                    return expressionStatement;
                }
            }
            popScope();
            return letNode;
        } catch (Throwable th2) {
            popScope();
            throw th2;
        }
    }

    private AstNode letStatement() throws IOException {
        if (this.currentToken != 153) {
            codeBug();
        }
        consumeToken();
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.lineno;
        int i12 = tokenStream.tokenBeg;
        AstNode let = peekToken() == 87 ? let(true, i12) : variables(153, i12, true);
        let.setLineno(i11);
        return let;
    }

    private int lineBeginningFor(int i11) {
        char[] cArr = this.sourceChars;
        if (cArr == null) {
            return -1;
        }
        if (i11 <= 0) {
            return 0;
        }
        if (i11 >= cArr.length) {
            i11 = cArr.length - 1;
        }
        while (true) {
            int i12 = i11 - 1;
            if (i12 < 0) {
                return 0;
            }
            char c11 = cArr[i12];
            if (c11 == '\n' || c11 == '\r') {
                break;
            }
            i11 = i12;
        }
        return i11;
    }

    private ErrorNode makeErrorNode() {
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        ErrorNode errorNode = new ErrorNode(i11, tokenStream.tokenEnd - i11);
        errorNode.setLineno(this.f78367ts.lineno);
        return errorNode;
    }

    private LabeledStatement matchJumpLabelName() throws IOException {
        if (peekTokenOrEOL() == 39) {
            consumeToken();
            Map<String, LabeledStatement> map = this.labelSet;
            r2 = map != null ? map.get(this.f78367ts.getString()) : null;
            if (r2 == null) {
                reportError("msg.undef.label");
            }
        }
        return r2;
    }

    private boolean matchToken(int i11) throws IOException {
        if (peekToken() != i11) {
            return false;
        }
        consumeToken();
        return true;
    }

    private AstNode memberExpr(boolean z11) throws IOException {
        AstNode astNode;
        int peekToken = peekToken();
        int i11 = this.f78367ts.lineno;
        if (peekToken != 30) {
            astNode = primaryExpr();
        } else {
            consumeToken();
            int i12 = this.f78367ts.tokenBeg;
            NewExpression newExpression = new NewExpression(i12);
            AstNode memberExpr = memberExpr(false);
            int nodeEnd = getNodeEnd(memberExpr);
            newExpression.setTarget(memberExpr);
            if (matchToken(87)) {
                int i13 = this.f78367ts.tokenBeg;
                List<AstNode> argumentList = argumentList();
                if (argumentList != null && argumentList.size() > 65536) {
                    reportError("msg.too.many.constructor.args");
                }
                TokenStream tokenStream = this.f78367ts;
                int i14 = tokenStream.tokenBeg;
                int i15 = tokenStream.tokenEnd;
                if (argumentList != null) {
                    newExpression.setArguments(argumentList);
                }
                newExpression.setParens(i13 - i12, i14 - i12);
                nodeEnd = i15;
            }
            if (matchToken(85)) {
                ObjectLiteral objectLiteral = objectLiteral();
                nodeEnd = getNodeEnd(objectLiteral);
                newExpression.setInitializer(objectLiteral);
            }
            newExpression.setLength(nodeEnd - i12);
            astNode = newExpression;
        }
        astNode.setLineno(i11);
        return memberExprTail(z11, astNode);
    }

    private AstNode memberExprTail(boolean z11, AstNode astNode) throws IOException {
        AstNode astNode2;
        if (astNode == null) {
            codeBug();
        }
        int position = astNode.getPosition();
        while (true) {
            int peekToken = peekToken();
            int i11 = -1;
            if (peekToken == 83) {
                consumeToken();
                TokenStream tokenStream = this.f78367ts;
                int i12 = tokenStream.tokenBeg;
                int i13 = tokenStream.lineno;
                AstNode expr = expr();
                int nodeEnd = getNodeEnd(expr);
                if (mustMatchToken(84, "msg.no.bracket.index")) {
                    TokenStream tokenStream2 = this.f78367ts;
                    int i14 = tokenStream2.tokenBeg;
                    nodeEnd = tokenStream2.tokenEnd;
                    i11 = i14;
                }
                ElementGet elementGet = new ElementGet(position, nodeEnd - position);
                elementGet.setTarget(astNode);
                elementGet.setElement(expr);
                elementGet.setParens(i12, i11);
                elementGet.setLineno(i13);
                astNode2 = elementGet;
            } else if (peekToken != 87) {
                if (peekToken == 108 || peekToken == 143) {
                    int i15 = this.f78367ts.lineno;
                    astNode = propertyAccess(peekToken, astNode);
                    astNode.setLineno(i15);
                } else {
                    if (peekToken != 146) {
                        break;
                    }
                    consumeToken();
                    TokenStream tokenStream3 = this.f78367ts;
                    int i16 = tokenStream3.tokenBeg;
                    int i17 = tokenStream3.lineno;
                    mustHaveXML();
                    setRequiresActivation();
                    AstNode expr2 = expr();
                    int nodeEnd2 = getNodeEnd(expr2);
                    if (mustMatchToken(88, "msg.no.paren")) {
                        TokenStream tokenStream4 = this.f78367ts;
                        int i18 = tokenStream4.tokenBeg;
                        nodeEnd2 = tokenStream4.tokenEnd;
                        i11 = i18;
                    }
                    XmlDotQuery xmlDotQuery = new XmlDotQuery(position, nodeEnd2 - position);
                    xmlDotQuery.setLeft(astNode);
                    xmlDotQuery.setRight(expr2);
                    xmlDotQuery.setOperatorPosition(i16);
                    xmlDotQuery.setRp(i11 - position);
                    xmlDotQuery.setLineno(i17);
                    astNode2 = xmlDotQuery;
                }
            } else {
                if (!z11) {
                    break;
                }
                int i19 = this.f78367ts.lineno;
                consumeToken();
                checkCallRequiresActivation(astNode);
                FunctionCall functionCall = new FunctionCall(position);
                functionCall.setTarget(astNode);
                functionCall.setLineno(i19);
                functionCall.setLp(this.f78367ts.tokenBeg - position);
                List<AstNode> argumentList = argumentList();
                if (argumentList != null && argumentList.size() > 65536) {
                    reportError("msg.too.many.function.args");
                }
                functionCall.setArguments(argumentList);
                functionCall.setRp(this.f78367ts.tokenBeg - position);
                functionCall.setLength(this.f78367ts.tokenEnd - position);
                astNode = functionCall;
            }
            astNode = astNode2;
        }
        return astNode;
    }

    private AstNode mulExpr() throws IOException {
        AstNode unaryExpr = unaryExpr();
        while (true) {
            int peekToken = peekToken();
            int i11 = this.f78367ts.tokenBeg;
            switch (peekToken) {
                case 23:
                case 24:
                case 25:
                    consumeToken();
                    unaryExpr = new InfixExpression(peekToken, unaryExpr, unaryExpr(), i11);
                default:
                    return unaryExpr;
            }
        }
    }

    private void mustHaveXML() {
        if (this.compilerEnv.isXmlAvailable()) {
            return;
        }
        reportError("msg.XML.not.available");
    }

    private boolean mustMatchToken(int i11, String str) throws IOException {
        TokenStream tokenStream = this.f78367ts;
        int i12 = tokenStream.tokenBeg;
        return mustMatchToken(i11, str, i12, tokenStream.tokenEnd - i12);
    }

    private AstNode name(int i11, int i12) throws IOException {
        String string = this.f78367ts.getString();
        TokenStream tokenStream = this.f78367ts;
        int i13 = tokenStream.tokenBeg;
        int i14 = tokenStream.lineno;
        if ((i11 & 131072) == 0 || peekToken() != 103) {
            saveNameTokenData(i13, string, i14);
            return this.compilerEnv.isXmlAvailable() ? propertyName(-1, string, 0) : createNameNode(true, 39);
        }
        Label label = new Label(i13, this.f78367ts.tokenEnd - i13);
        label.setName(string);
        label.setLineno(this.f78367ts.lineno);
        return label;
    }

    private AstNode nameOrLabel() throws IOException {
        AstNode astNode;
        if (this.currentToken != 39) {
            throw codeBug();
        }
        int i11 = this.f78367ts.tokenBeg;
        this.currentFlaggedToken |= 131072;
        AstNode expr = expr();
        if (expr.getType() != 130) {
            ExpressionStatement expressionStatement = new ExpressionStatement(expr, !insideFunction());
            expressionStatement.lineno = expr.lineno;
            return expressionStatement;
        }
        LabeledStatement labeledStatement = new LabeledStatement(i11);
        recordLabel((Label) expr, labeledStatement);
        labeledStatement.setLineno(this.f78367ts.lineno);
        while (true) {
            if (peekToken() != 39) {
                astNode = null;
                break;
            }
            this.currentFlaggedToken |= 131072;
            AstNode expr2 = expr();
            if (expr2.getType() != 130) {
                astNode = new ExpressionStatement(expr2, !insideFunction());
                autoInsertSemicolon(astNode);
                break;
            }
            recordLabel((Label) expr2, labeledStatement);
        }
        try {
            this.currentLabel = labeledStatement;
            if (astNode == null) {
                astNode = statementHelper();
            }
            labeledStatement.setLength(astNode.getParent() == null ? getNodeEnd(astNode) - i11 : getNodeEnd(astNode));
            labeledStatement.setStatement(astNode);
            return labeledStatement;
        } finally {
            this.currentLabel = null;
            Iterator<Label> it = labeledStatement.getLabels().iterator();
            while (it.hasNext()) {
                this.labelSet.remove(it.next().getName());
            }
        }
    }

    private int nextFlaggedToken() throws IOException {
        peekToken();
        int i11 = this.currentFlaggedToken;
        consumeToken();
        return i11;
    }

    private int nextToken() throws IOException {
        int peekToken = peekToken();
        consumeToken();
        return peekToken;
    }

    private int nodeEnd(AstNode astNode) {
        return astNode.getPosition() + astNode.getLength();
    }

    private static final boolean nowAllSet(int i11, int i12, int i13) {
        return (i11 & i13) != i13 && (i12 & i13) == i13;
    }

    private ObjectLiteral objectLiteral() throws IOException {
        HashSet hashSet;
        HashSet hashSet2;
        String string;
        char c11;
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        int i12 = tokenStream.lineno;
        ArrayList arrayList = new ArrayList();
        if (this.inUseStrictDirective) {
            hashSet = new HashSet();
            hashSet2 = new HashSet();
        } else {
            hashSet = null;
            hashSet2 = null;
        }
        Comment andResetJsDoc = getAndResetJsDoc();
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int peekToken = peekToken();
            Comment andResetJsDoc2 = getAndResetJsDoc();
            if (peekToken == 39) {
                Name createNameNode = createNameNode();
                string = this.f78367ts.getString();
                int i15 = this.f78367ts.tokenBeg;
                consumeToken();
                int peekToken2 = peekToken();
                if ((!d.f46852f.equals(string) && !d.f46854h.equals(string)) || peekToken2 == 89 || peekToken2 == 103 || peekToken2 == 86) {
                    createNameNode.setJsDocNode(andResetJsDoc2);
                    arrayList.add(plainProperty(createNameNode, peekToken));
                    c11 = 1;
                } else {
                    boolean equals = d.f46852f.equals(string);
                    c11 = equals ? (char) 2 : (char) 4;
                    AstNode objliteralProperty = objliteralProperty();
                    if (objliteralProperty != null) {
                        string = this.f78367ts.getString();
                        ObjectProperty objectProperty = getterSetterProperty(i15, objliteralProperty, equals);
                        objliteralProperty.setJsDocNode(andResetJsDoc2);
                        arrayList.add(objectProperty);
                    }
                    string = null;
                }
            } else if (peekToken != 86) {
                AstNode objliteralProperty2 = objliteralProperty();
                if (objliteralProperty2 == null) {
                    c11 = 1;
                    string = null;
                } else {
                    string = this.f78367ts.getString();
                    objliteralProperty2.setJsDocNode(andResetJsDoc2);
                    arrayList.add(plainProperty(objliteralProperty2, peekToken));
                    c11 = 1;
                }
            } else if (i14 != i13) {
                warnTrailingComma(i11, arrayList, i14);
            }
            if (this.inUseStrictDirective && string != null) {
                if (c11 == 1) {
                    if (hashSet.contains(string) || hashSet2.contains(string)) {
                        addError("msg.dup.obj.lit.prop.strict", string);
                    }
                    hashSet.add(string);
                    hashSet2.add(string);
                } else if (c11 == 2) {
                    if (hashSet.contains(string)) {
                        addError("msg.dup.obj.lit.prop.strict", string);
                    }
                    hashSet.add(string);
                } else if (c11 == 4) {
                    if (hashSet2.contains(string)) {
                        addError("msg.dup.obj.lit.prop.strict", string);
                    }
                    hashSet2.add(string);
                }
            }
            getAndResetJsDoc();
            if (!matchToken(89)) {
                break;
            }
            i14 = this.f78367ts.tokenEnd;
            i13 = -1;
        }
        mustMatchToken(86, "msg.no.brace.prop");
        ObjectLiteral objectLiteral = new ObjectLiteral(i11, this.f78367ts.tokenEnd - i11);
        if (andResetJsDoc != null) {
            objectLiteral.setJsDocNode(andResetJsDoc);
        }
        objectLiteral.setElements(arrayList);
        objectLiteral.setLineno(i12);
        return objectLiteral;
    }

    private AstNode objliteralProperty() throws IOException {
        AstNode createNameNode;
        switch (peekToken()) {
            case 39:
                createNameNode = createNameNode();
                break;
            case 40:
                TokenStream tokenStream = this.f78367ts;
                createNameNode = new NumberLiteral(tokenStream.tokenBeg, tokenStream.getString(), this.f78367ts.getNumber());
                break;
            case 41:
                createNameNode = createStringLiteral();
                break;
            default:
                if (!this.compilerEnv.isReservedKeywordAsIdentifier() || !TokenStream.isKeyword(this.f78367ts.getString())) {
                    reportError("msg.bad.prop");
                    return null;
                }
                createNameNode = createNameNode();
                break;
        }
        consumeToken();
        return createNameNode;
    }

    private AstNode orExpr() throws IOException {
        AstNode andExpr = andExpr();
        if (!matchToken(104)) {
            return andExpr;
        }
        return new InfixExpression(104, andExpr, orExpr(), this.f78367ts.tokenBeg);
    }

    private AstNode parenExpr() throws IOException {
        boolean z11 = this.inForInit;
        this.inForInit = false;
        try {
            Comment andResetJsDoc = getAndResetJsDoc();
            TokenStream tokenStream = this.f78367ts;
            int i11 = tokenStream.lineno;
            int i12 = tokenStream.tokenBeg;
            AstNode expr = expr();
            if (peekToken() == 119) {
                return generatorExpression(expr, i12);
            }
            ParenthesizedExpression parenthesizedExpression = new ParenthesizedExpression(expr);
            if (andResetJsDoc == null) {
                andResetJsDoc = getAndResetJsDoc();
            }
            if (andResetJsDoc != null) {
                parenthesizedExpression.setJsDocNode(andResetJsDoc);
            }
            mustMatchToken(88, "msg.no.paren");
            parenthesizedExpression.setLength(this.f78367ts.tokenEnd - parenthesizedExpression.getPosition());
            parenthesizedExpression.setLineno(i11);
            return parenthesizedExpression;
        } finally {
            this.inForInit = z11;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(1:5)(9:6|7|8|(1:10)(2:20|(2:21|(3:25|(2:27|(1:39)(2:29|(2:31|32)(2:34|(2:36|37)(1:38))))(2:40|41)|33)(3:43|42|44)))|11|12|(1:16)|17|18))|50|7|8|(0)(0)|11|12|(2:14|16)|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        r11.nestingOfFunction--;
        r11.inUseStrictDirective = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[Catch: all -> 0x0056, ParserException -> 0x008c, TRY_ENTER, TryCatch #2 {ParserException -> 0x008c, all -> 0x0056, blocks: (B:10:0x0038, B:21:0x0059, B:27:0x0068, B:29:0x006e, B:34:0x0076, B:36:0x007e, B:33:0x0088, B:40:0x0081), top: B:8:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.AstNode parseFunctionBody() throws java.io.IOException {
        /*
            r11 = this;
            r0 = 85
            boolean r0 = r11.matchToken(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1c
            org.mozilla.javascript.CompilerEnvirons r0 = r11.compilerEnv
            int r0 = r0.getLanguageVersion()
            r3 = 180(0xb4, float:2.52E-43)
            if (r0 >= r3) goto L1a
            java.lang.String r0 = "msg.no.brace.body"
            r11.reportError(r0)
            goto L1c
        L1a:
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            int r3 = r11.nestingOfFunction
            int r3 = r3 + r1
            r11.nestingOfFunction = r3
            org.mozilla.javascript.TokenStream r3 = r11.f78367ts
            int r3 = r3.tokenBeg
            org.mozilla.javascript.ast.Block r4 = new org.mozilla.javascript.ast.Block
            r4.<init>(r3)
            boolean r5 = r11.inUseStrictDirective
            org.mozilla.javascript.TokenStream r6 = r11.f78367ts
            int r6 = r6.lineno
            r4.setLineno(r6)
            r6 = 86
            if (r0 == 0) goto L58
            org.mozilla.javascript.ast.ReturnStatement r2 = new org.mozilla.javascript.ast.ReturnStatement     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            org.mozilla.javascript.TokenStream r7 = r11.f78367ts     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            int r7 = r7.lineno     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            org.mozilla.javascript.ast.AstNode r7 = r11.assignExpr()     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            r2.setReturnValue(r7)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            r8 = 25
            r2.putProp(r8, r7)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            r4.putProp(r8, r7)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            r4.addStatement(r2)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            goto L8c
        L56:
            r0 = move-exception
            goto L94
        L58:
            r7 = r1
        L59:
            int r8 = r11.peekToken()     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            r9 = -1
            if (r8 == r9) goto L8c
            if (r8 == 0) goto L8c
            if (r8 == r6) goto L8c
            r9 = 109(0x6d, float:1.53E-43)
            if (r8 == r9) goto L81
            org.mozilla.javascript.ast.AstNode r8 = r11.statement()     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            if (r7 == 0) goto L88
            java.lang.String r9 = r11.getDirective(r8)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            if (r9 != 0) goto L76
            r7 = r2
            goto L88
        L76:
            java.lang.String r10 = "use strict"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            if (r9 == 0) goto L88
            r11.inUseStrictDirective = r1     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            goto L88
        L81:
            r11.consumeToken()     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            org.mozilla.javascript.ast.FunctionNode r8 = r11.function(r1)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
        L88:
            r4.addStatement(r8)     // Catch: java.lang.Throwable -> L56 org.mozilla.javascript.Parser.ParserException -> L8c
            goto L59
        L8c:
            int r2 = r11.nestingOfFunction
            int r2 = r2 - r1
            r11.nestingOfFunction = r2
            r11.inUseStrictDirective = r5
            goto L9c
        L94:
            int r2 = r11.nestingOfFunction
            int r2 = r2 - r1
            r11.nestingOfFunction = r2
            r11.inUseStrictDirective = r5
            throw r0
        L9c:
            org.mozilla.javascript.TokenStream r1 = r11.f78367ts
            int r1 = r1.tokenEnd
            r11.getAndResetJsDoc()
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "msg.no.brace.after.body"
            boolean r0 = r11.mustMatchToken(r6, r0)
            if (r0 == 0) goto Lb1
            org.mozilla.javascript.TokenStream r0 = r11.f78367ts
            int r1 = r0.tokenEnd
        Lb1:
            int r1 = r1 - r3
            r4.setLength(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.parseFunctionBody():org.mozilla.javascript.ast.AstNode");
    }

    private void parseFunctionParams(FunctionNode functionNode) throws IOException {
        if (matchToken(88)) {
            functionNode.setRp(this.f78367ts.tokenBeg - functionNode.getPosition());
            return;
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = null;
        do {
            int peekToken = peekToken();
            if (peekToken == 83 || peekToken == 85) {
                AstNode destructuringPrimaryExpr = destructuringPrimaryExpr();
                markDestructuring(destructuringPrimaryExpr);
                functionNode.addParam(destructuringPrimaryExpr);
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                String nextTempName = this.currentScriptOrFn.getNextTempName();
                defineSymbol(87, nextTempName, false);
                hashMap.put(nextTempName, destructuringPrimaryExpr);
            } else if (mustMatchToken(39, "msg.no.parm")) {
                functionNode.addParam(createNameNode());
                String string = this.f78367ts.getString();
                defineSymbol(87, string);
                if (this.inUseStrictDirective) {
                    if ("eval".equals(string) || "arguments".equals(string)) {
                        reportError("msg.bad.id.strict", string);
                    }
                    if (hashSet.contains(string)) {
                        addError("msg.dup.param.strict", string);
                    }
                    hashSet.add(string);
                }
            } else {
                functionNode.addParam(makeErrorNode());
            }
        } while (matchToken(89));
        if (hashMap != null) {
            Node node = new Node(89);
            for (Map.Entry entry : hashMap.entrySet()) {
                node.addChildToBack(createDestructuringAssignment(122, (Node) entry.getValue(), createName((String) entry.getKey())));
            }
            functionNode.putProp(23, node);
        }
        if (mustMatchToken(88, "msg.no.paren.after.parms")) {
            functionNode.setRp(this.f78367ts.tokenBeg - functionNode.getPosition());
        }
    }

    private int peekFlaggedToken() throws IOException {
        peekToken();
        return this.currentFlaggedToken;
    }

    private int peekToken() throws IOException {
        if (this.currentFlaggedToken != 0) {
            return this.currentToken;
        }
        int lineno = this.f78367ts.getLineno();
        int token = this.f78367ts.getToken();
        boolean z11 = false;
        while (true) {
            if (token != 1 && token != 161) {
                break;
            }
            if (token == 1) {
                lineno++;
                z11 = true;
            } else if (this.compilerEnv.isRecordingComments()) {
                String andResetCurrentComment = this.f78367ts.getAndResetCurrentComment();
                recordComment(lineno, andResetCurrentComment);
                lineno += getNumberOfEols(andResetCurrentComment);
            }
            token = this.f78367ts.getToken();
        }
        this.currentToken = token;
        this.currentFlaggedToken = token | (z11 ? 65536 : 0);
        return token;
    }

    private int peekTokenOrEOL() throws IOException {
        int peekToken = peekToken();
        if ((this.currentFlaggedToken & 65536) != 0) {
            return 1;
        }
        return peekToken;
    }

    private ObjectProperty plainProperty(AstNode astNode, int i11) throws IOException {
        int peekToken = peekToken();
        if ((peekToken != 89 && peekToken != 86) || i11 != 39 || this.compilerEnv.getLanguageVersion() < 180) {
            mustMatchToken(103, "msg.no.colon.prop");
            ObjectProperty objectProperty = new ObjectProperty();
            objectProperty.setOperatorPosition(this.f78367ts.tokenBeg);
            objectProperty.setLeftAndRight(astNode, assignExpr());
            return objectProperty;
        }
        if (!this.inDestructuringAssignment) {
            reportError("msg.bad.object.init");
        }
        Name name = new Name(astNode.getPosition(), astNode.getString());
        ObjectProperty objectProperty2 = new ObjectProperty();
        objectProperty2.putProp(26, Boolean.TRUE);
        objectProperty2.setLeftAndRight(astNode, name);
        return objectProperty2;
    }

    private AstNode primaryExpr() throws IOException {
        int nextFlaggedToken = nextFlaggedToken();
        int i11 = 65535 & nextFlaggedToken;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 24) {
                    if (i11 == 83) {
                        return arrayLiteral();
                    }
                    if (i11 == 85) {
                        return objectLiteral();
                    }
                    if (i11 == 87) {
                        return parenExpr();
                    }
                    if (i11 != 100) {
                        if (i11 == 109) {
                            return function(2);
                        }
                        if (i11 == 127) {
                            reportError("msg.reserved.id");
                        } else {
                            if (i11 == 147) {
                                mustHaveXML();
                                return attributeAccess();
                            }
                            if (i11 == 153) {
                                return let(false, this.f78367ts.tokenBeg);
                            }
                            switch (i11) {
                                case 39:
                                    return name(nextFlaggedToken, i11);
                                case 40:
                                    String string = this.f78367ts.getString();
                                    if (this.inUseStrictDirective && this.f78367ts.isNumberOctal()) {
                                        reportError("msg.no.octal.strict");
                                    }
                                    TokenStream tokenStream = this.f78367ts;
                                    return new NumberLiteral(tokenStream.tokenBeg, string, tokenStream.getNumber());
                                case 41:
                                    return createStringLiteral();
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                    TokenStream tokenStream2 = this.f78367ts;
                                    int i12 = tokenStream2.tokenBeg;
                                    return new KeywordLiteral(i12, tokenStream2.tokenEnd - i12, i11);
                                default:
                                    reportError("msg.syntax");
                                    break;
                            }
                        }
                    }
                }
                this.f78367ts.readRegExp(i11);
                TokenStream tokenStream3 = this.f78367ts;
                int i13 = tokenStream3.tokenBeg;
                RegExpLiteral regExpLiteral = new RegExpLiteral(i13, tokenStream3.tokenEnd - i13);
                regExpLiteral.setValue(this.f78367ts.getString());
                regExpLiteral.setFlags(this.f78367ts.readAndClearRegExpFlags());
                return regExpLiteral;
            }
            reportError("msg.unexpected.eof");
        }
        return makeErrorNode();
    }

    private AstNode propertyAccess(int i11, AstNode astNode) throws IOException {
        int i12;
        AstNode propertyName;
        String keywordToName;
        if (astNode == null) {
            codeBug();
        }
        TokenStream tokenStream = this.f78367ts;
        int i13 = tokenStream.lineno;
        int i14 = tokenStream.tokenBeg;
        consumeToken();
        if (i11 == 143) {
            mustHaveXML();
            i12 = 4;
        } else {
            i12 = 0;
        }
        if (!this.compilerEnv.isXmlAvailable()) {
            if (nextToken() != 39 && (!this.compilerEnv.isReservedKeywordAsIdentifier() || !TokenStream.isKeyword(this.f78367ts.getString()))) {
                reportError("msg.no.name.after.dot");
            }
            PropertyGet propertyGet = new PropertyGet(astNode, createNameNode(true, 33), i14);
            propertyGet.setLineno(i13);
            return propertyGet;
        }
        int nextToken = nextToken();
        if (nextToken == 23) {
            TokenStream tokenStream2 = this.f78367ts;
            saveNameTokenData(tokenStream2.tokenBeg, "*", tokenStream2.lineno);
            propertyName = propertyName(-1, "*", i12);
        } else if (nextToken == 39) {
            propertyName = propertyName(-1, this.f78367ts.getString(), i12);
        } else if (nextToken == 50) {
            TokenStream tokenStream3 = this.f78367ts;
            saveNameTokenData(tokenStream3.tokenBeg, "throw", tokenStream3.lineno);
            propertyName = propertyName(-1, "throw", i12);
        } else if (nextToken == 147) {
            propertyName = attributeAccess();
        } else {
            if (!this.compilerEnv.isReservedKeywordAsIdentifier() || (keywordToName = Token.keywordToName(nextToken)) == null) {
                reportError("msg.no.name.after.dot");
                return makeErrorNode();
            }
            TokenStream tokenStream4 = this.f78367ts;
            saveNameTokenData(tokenStream4.tokenBeg, keywordToName, tokenStream4.lineno);
            propertyName = propertyName(-1, keywordToName, i12);
        }
        boolean z11 = propertyName instanceof XmlRef;
        InfixExpression xmlMemberGet = z11 ? new XmlMemberGet() : new PropertyGet();
        if (z11 && i11 == 108) {
            xmlMemberGet.setType(108);
        }
        int position = astNode.getPosition();
        xmlMemberGet.setPosition(position);
        xmlMemberGet.setLength(getNodeEnd(propertyName) - position);
        xmlMemberGet.setOperatorPosition(i14 - position);
        xmlMemberGet.setLineno(astNode.getLineno());
        xmlMemberGet.setLeft(astNode);
        xmlMemberGet.setRight(propertyName);
        return xmlMemberGet;
    }

    private AstNode propertyName(int i11, String str, int i12) throws IOException {
        Name name;
        int i13;
        int i14 = i11 != -1 ? i11 : this.f78367ts.tokenBeg;
        int i15 = this.f78367ts.lineno;
        Name createNameNode = createNameNode(true, this.currentToken);
        if (matchToken(144)) {
            i13 = this.f78367ts.tokenBeg;
            int nextToken = nextToken();
            if (nextToken == 23) {
                TokenStream tokenStream = this.f78367ts;
                saveNameTokenData(tokenStream.tokenBeg, "*", tokenStream.lineno);
                name = createNameNode(false, -1);
            } else {
                if (nextToken != 39) {
                    if (nextToken == 83) {
                        return xmlElemRef(i11, createNameNode, i13);
                    }
                    reportError("msg.no.name.after.coloncolon");
                    return makeErrorNode();
                }
                name = createNameNode();
            }
        } else {
            name = createNameNode;
            createNameNode = null;
            i13 = -1;
        }
        if (createNameNode == null && i12 == 0 && i11 == -1) {
            return name;
        }
        XmlPropRef xmlPropRef = new XmlPropRef(i14, getNodeEnd(name) - i14);
        xmlPropRef.setAtPos(i11);
        xmlPropRef.setNamespace(createNameNode);
        xmlPropRef.setColonPos(i13);
        xmlPropRef.setPropName(name);
        xmlPropRef.setLineno(i15);
        return xmlPropRef;
    }

    private String readFully(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        try {
            char[] cArr = new char[1024];
            StringBuilder sb2 = new StringBuilder(1024);
            while (true) {
                int read = bufferedReader.read(cArr, 0, 1024);
                if (read == -1) {
                    String sb3 = sb2.toString();
                    bufferedReader.close();
                    return sb3;
                }
                sb2.append(cArr, 0, read);
            }
        } catch (Throwable th2) {
            bufferedReader.close();
            throw th2;
        }
    }

    private void recordComment(int i11, String str) {
        if (this.scannedComments == null) {
            this.scannedComments = new ArrayList();
        }
        TokenStream tokenStream = this.f78367ts;
        Comment comment = new Comment(tokenStream.tokenBeg, tokenStream.getTokenLength(), this.f78367ts.commentType, str);
        if (this.f78367ts.commentType == Token.CommentType.JSDOC && this.compilerEnv.isRecordingLocalJsDocComments()) {
            this.currentJsDocComment = comment;
        }
        comment.setLineno(i11);
        this.scannedComments.add(comment);
    }

    private void recordLabel(Label label, LabeledStatement labeledStatement) throws IOException {
        if (peekToken() != 103) {
            codeBug();
        }
        consumeToken();
        String name = label.getName();
        Map<String, LabeledStatement> map = this.labelSet;
        if (map == null) {
            this.labelSet = new HashMap();
        } else {
            LabeledStatement labeledStatement2 = map.get(name);
            if (labeledStatement2 != null) {
                if (this.compilerEnv.isIdeMode()) {
                    Label labelByName = labeledStatement2.getLabelByName(name);
                    reportError("msg.dup.label", labelByName.getAbsolutePosition(), labelByName.getLength());
                }
                reportError("msg.dup.label", label.getPosition(), label.getLength());
            }
        }
        labeledStatement.addLabel(label);
        this.labelSet.put(name, labeledStatement);
    }

    private AstNode relExpr() throws IOException {
        AstNode shiftExpr = shiftExpr();
        while (true) {
            int peekToken = peekToken();
            int i11 = this.f78367ts.tokenBeg;
            if (peekToken != 52) {
                if (peekToken != 53) {
                    switch (peekToken) {
                    }
                } else {
                    continue;
                }
                consumeToken();
                shiftExpr = new InfixExpression(peekToken, shiftExpr, shiftExpr(), i11);
            } else if (!this.inForInit) {
                consumeToken();
                shiftExpr = new InfixExpression(peekToken, shiftExpr, shiftExpr(), i11);
            }
        }
        return shiftExpr;
    }

    private AstNode returnOrYield(int i11, boolean z11) throws IOException {
        int i12;
        AstNode astNode;
        AstNode yield;
        if (!insideFunction()) {
            reportError(i11 == 4 ? "msg.bad.return" : "msg.bad.yield");
        }
        consumeToken();
        TokenStream tokenStream = this.f78367ts;
        int i13 = tokenStream.lineno;
        int i14 = tokenStream.tokenBeg;
        int i15 = tokenStream.tokenEnd;
        int peekTokenOrEOL = peekTokenOrEOL();
        if (peekTokenOrEOL == -1 || peekTokenOrEOL == 0 || peekTokenOrEOL == 1 || peekTokenOrEOL == 72 || peekTokenOrEOL == 82 || peekTokenOrEOL == 84 || peekTokenOrEOL == 86 || peekTokenOrEOL == 88) {
            i12 = i15;
            astNode = null;
        } else {
            astNode = expr();
            i12 = getNodeEnd(astNode);
        }
        int i16 = this.endFlags;
        if (i11 == 4) {
            this.endFlags = i16 | (astNode == null ? 2 : 4);
            int i17 = i12 - i14;
            yield = new ReturnStatement(i14, i17, astNode);
            if (nowAllSet(i16, this.endFlags, 6)) {
                addStrictWarning("msg.return.inconsistent", "", i14, i17);
            }
        } else {
            if (!insideFunction()) {
                reportError("msg.bad.yield");
            }
            this.endFlags |= 8;
            yield = new Yield(i14, i12 - i14, astNode);
            setRequiresActivation();
            setIsGenerator();
            if (!z11) {
                yield = new ExpressionStatement(yield);
            }
        }
        if (insideFunction() && nowAllSet(i16, this.endFlags, 12)) {
            Name functionName = ((FunctionNode) this.currentScriptOrFn).getFunctionName();
            if (functionName == null || functionName.length() == 0) {
                addError("msg.anon.generator.returns", "");
            } else {
                addError("msg.generator.returns", functionName.getIdentifier());
            }
        }
        yield.setLineno(i13);
        return yield;
    }

    private void saveNameTokenData(int i11, String str, int i12) {
        this.prevNameTokenStart = i11;
        this.prevNameTokenString = str;
        this.prevNameTokenLineno = i12;
    }

    private AstNode shiftExpr() throws IOException {
        AstNode addExpr = addExpr();
        while (true) {
            int peekToken = peekToken();
            int i11 = this.f78367ts.tokenBeg;
            switch (peekToken) {
                case 18:
                case 19:
                case 20:
                    consumeToken();
                    addExpr = new InfixExpression(peekToken, addExpr, addExpr(), i11);
                default:
                    return addExpr;
            }
        }
    }

    private AstNode statement() throws IOException {
        int peekTokenOrEOL;
        int i11 = this.f78367ts.tokenBeg;
        try {
            AstNode statementHelper = statementHelper();
            if (statementHelper != null) {
                if (this.compilerEnv.isStrictMode() && !statementHelper.hasSideEffects()) {
                    int position = statementHelper.getPosition();
                    int max = Math.max(position, lineBeginningFor(position));
                    addStrictWarning(statementHelper instanceof EmptyStatement ? "msg.extra.trailing.semi" : "msg.no.side.effects", "", max, nodeEnd(statementHelper) - max);
                }
                return statementHelper;
            }
        } catch (ParserException unused) {
        }
        do {
            peekTokenOrEOL = peekTokenOrEOL();
            consumeToken();
            if (peekTokenOrEOL == -1 || peekTokenOrEOL == 0 || peekTokenOrEOL == 1) {
                break;
            }
        } while (peekTokenOrEOL != 82);
        return new EmptyStatement(i11, this.f78367ts.tokenBeg - i11);
    }

    private AstNode statementHelper() throws IOException {
        AstNode returnOrYield;
        LabeledStatement labeledStatement = this.currentLabel;
        if (labeledStatement != null && labeledStatement.getStatement() != null) {
            this.currentLabel = null;
        }
        int peekToken = peekToken();
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        if (peekToken == -1) {
            consumeToken();
            return makeErrorNode();
        }
        if (peekToken != 4) {
            if (peekToken == 39) {
                returnOrYield = nameOrLabel();
                if (!(returnOrYield instanceof ExpressionStatement)) {
                    return returnOrYield;
                }
            } else if (peekToken == 50) {
                returnOrYield = throwStatement();
            } else if (peekToken != 72) {
                if (peekToken == 85) {
                    return block();
                }
                if (peekToken == 109) {
                    consumeToken();
                    return function(3);
                }
                if (peekToken == 112) {
                    return ifStatement();
                }
                if (peekToken == 114) {
                    return switchStatement();
                }
                if (peekToken == 160) {
                    consumeToken();
                    TokenStream tokenStream2 = this.f78367ts;
                    int i12 = tokenStream2.tokenBeg;
                    returnOrYield = new KeywordLiteral(i12, tokenStream2.tokenEnd - i12, peekToken);
                    returnOrYield.setLineno(this.f78367ts.lineno);
                } else {
                    if (peekToken == 81) {
                        return tryStatement();
                    }
                    if (peekToken == 82) {
                        consumeToken();
                        int i13 = this.f78367ts.tokenBeg;
                        EmptyStatement emptyStatement = new EmptyStatement(i13, this.f78367ts.tokenEnd - i13);
                        emptyStatement.setLineno(this.f78367ts.lineno);
                        return emptyStatement;
                    }
                    if (peekToken != 153) {
                        if (peekToken != 154) {
                            switch (peekToken) {
                                case 116:
                                    returnOrYield = defaultXmlNamespace();
                                    break;
                                case 117:
                                    return whileLoop();
                                case 118:
                                    return doLoop();
                                case 119:
                                    return forLoop();
                                case 120:
                                    returnOrYield = breakStatement();
                                    break;
                                case 121:
                                    returnOrYield = continueStatement();
                                    break;
                                case 122:
                                    break;
                                case 123:
                                    if (this.inUseStrictDirective) {
                                        reportError("msg.no.with.strict");
                                    }
                                    return withStatement();
                                default:
                                    int i14 = tokenStream.lineno;
                                    returnOrYield = new ExpressionStatement(expr(), true ^ insideFunction());
                                    returnOrYield.setLineno(i14);
                                    break;
                            }
                        }
                        consumeToken();
                        TokenStream tokenStream3 = this.f78367ts;
                        int i15 = tokenStream3.lineno;
                        VariableDeclaration variables = variables(this.currentToken, tokenStream3.tokenBeg, true);
                        variables.setLineno(i15);
                        returnOrYield = variables;
                    } else {
                        returnOrYield = letStatement();
                        if (!(returnOrYield instanceof VariableDeclaration) || peekToken() != 82) {
                            return returnOrYield;
                        }
                    }
                }
            }
            autoInsertSemicolon(returnOrYield);
            return returnOrYield;
        }
        returnOrYield = returnOrYield(peekToken, false);
        autoInsertSemicolon(returnOrYield);
        return returnOrYield;
    }

    private AstNode statements(AstNode astNode) throws IOException {
        if (this.currentToken != 85 && !this.compilerEnv.isIdeMode()) {
            codeBug();
        }
        int i11 = this.f78367ts.tokenBeg;
        if (astNode == null) {
            astNode = new Block(i11);
        }
        astNode.setLineno(this.f78367ts.lineno);
        while (true) {
            int peekToken = peekToken();
            if (peekToken <= 0 || peekToken == 86) {
                break;
            }
            astNode.addChild(statement());
        }
        astNode.setLength(this.f78367ts.tokenBeg - i11);
        return astNode;
    }

    private SwitchStatement switchStatement() throws IOException {
        AstNode expr;
        if (this.currentToken != 114) {
            codeBug();
        }
        consumeToken();
        int i11 = this.f78367ts.tokenBeg;
        SwitchStatement switchStatement = new SwitchStatement(i11);
        if (mustMatchToken(87, "msg.no.paren.switch")) {
            switchStatement.setLp(this.f78367ts.tokenBeg - i11);
        }
        switchStatement.setLineno(this.f78367ts.lineno);
        switchStatement.setExpression(expr());
        enterSwitch(switchStatement);
        try {
            if (mustMatchToken(88, "msg.no.paren.after.switch")) {
                switchStatement.setRp(this.f78367ts.tokenBeg - i11);
            }
            mustMatchToken(85, "msg.no.brace.switch");
            boolean z11 = false;
            while (true) {
                int nextToken = nextToken();
                TokenStream tokenStream = this.f78367ts;
                int i12 = tokenStream.tokenBeg;
                int i13 = tokenStream.lineno;
                if (nextToken == 86) {
                    switchStatement.setLength(tokenStream.tokenEnd - i11);
                    break;
                }
                if (nextToken == 115) {
                    expr = expr();
                    mustMatchToken(103, "msg.no.colon.case");
                } else {
                    if (nextToken != 116) {
                        reportError("msg.bad.switch");
                        break;
                    }
                    if (z11) {
                        reportError("msg.double.switch.default");
                    }
                    mustMatchToken(103, "msg.no.colon.case");
                    z11 = true;
                    expr = null;
                }
                SwitchCase switchCase = new SwitchCase(i12);
                switchCase.setExpression(expr);
                switchCase.setLength(this.f78367ts.tokenEnd - i11);
                switchCase.setLineno(i13);
                while (true) {
                    int peekToken = peekToken();
                    if (peekToken != 86 && peekToken != 115 && peekToken != 116 && peekToken != 0) {
                        switchCase.addStatement(statement());
                    }
                }
                switchStatement.addCase(switchCase);
            }
            exitSwitch();
            return switchStatement;
        } catch (Throwable th2) {
            exitSwitch();
            throw th2;
        }
    }

    private ThrowStatement throwStatement() throws IOException {
        if (this.currentToken != 50) {
            codeBug();
        }
        consumeToken();
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        int i12 = tokenStream.lineno;
        if (peekTokenOrEOL() == 1) {
            reportError("msg.bad.throw.eol");
        }
        AstNode expr = expr();
        ThrowStatement throwStatement = new ThrowStatement(i11, getNodeEnd(expr), expr);
        throwStatement.setLineno(i12);
        return throwStatement;
    }

    private TryStatement tryStatement() throws IOException {
        int i11;
        ArrayList arrayList;
        int i12;
        AstNode astNode;
        int i13;
        AstNode astNode2;
        if (this.currentToken != 81) {
            codeBug();
        }
        consumeToken();
        Comment andResetJsDoc = getAndResetJsDoc();
        TokenStream tokenStream = this.f78367ts;
        int i14 = tokenStream.tokenBeg;
        int i15 = tokenStream.lineno;
        int i16 = 85;
        if (peekToken() != 85) {
            reportError("msg.no.brace.try");
        }
        AstNode statement = statement();
        int nodeEnd = getNodeEnd(statement);
        int peekToken = peekToken();
        if (peekToken == 124) {
            boolean z11 = false;
            arrayList = null;
            for (int i17 = 124; matchToken(i17); i17 = 124) {
                int i18 = this.f78367ts.lineno;
                if (z11) {
                    reportError("msg.catch.unreachable");
                }
                int i19 = this.f78367ts.tokenBeg;
                int i21 = mustMatchToken(87, "msg.no.paren.catch") ? this.f78367ts.tokenBeg : -1;
                mustMatchToken(39, "msg.bad.catchcond");
                Name createNameNode = createNameNode();
                String identifier = createNameNode.getIdentifier();
                if (this.inUseStrictDirective && ("eval".equals(identifier) || "arguments".equals(identifier))) {
                    reportError("msg.bad.id.strict", identifier);
                }
                if (matchToken(112)) {
                    i13 = this.f78367ts.tokenBeg;
                    astNode2 = expr();
                } else {
                    z11 = true;
                    i13 = -1;
                    astNode2 = null;
                }
                int i22 = mustMatchToken(88, "msg.bad.catchcond") ? this.f78367ts.tokenBeg : -1;
                mustMatchToken(i16, "msg.no.brace.catchblock");
                Block block = (Block) statements();
                int nodeEnd2 = getNodeEnd(block);
                CatchClause catchClause = new CatchClause(i19);
                catchClause.setVarName(createNameNode);
                catchClause.setCatchCondition(astNode2);
                catchClause.setBody(block);
                if (i13 != -1) {
                    catchClause.setIfPosition(i13 - i19);
                }
                catchClause.setParens(i21, i22);
                catchClause.setLineno(i18);
                nodeEnd = mustMatchToken(86, "msg.no.brace.after.body") ? this.f78367ts.tokenEnd : nodeEnd2;
                catchClause.setLength(nodeEnd - i19);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(catchClause);
                i16 = 85;
            }
            i11 = 125;
        } else {
            i11 = 125;
            if (peekToken != 125) {
                mustMatchToken(125, "msg.try.no.catchfinally");
            }
            arrayList = null;
        }
        if (matchToken(i11)) {
            int i23 = this.f78367ts.tokenBeg;
            AstNode statement2 = statement();
            nodeEnd = getNodeEnd(statement2);
            astNode = statement2;
            i12 = i23;
        } else {
            i12 = -1;
            astNode = null;
        }
        TryStatement tryStatement = new TryStatement(i14, nodeEnd - i14);
        tryStatement.setTryBlock(statement);
        tryStatement.setCatchClauses(arrayList);
        tryStatement.setFinallyBlock(astNode);
        if (i12 != -1) {
            tryStatement.setFinallyPosition(i12 - i14);
        }
        tryStatement.setLineno(i15);
        if (andResetJsDoc != null) {
            tryStatement.setJsDocNode(andResetJsDoc);
        }
        return tryStatement;
    }

    private AstNode unaryExpr() throws IOException {
        int peekToken = peekToken();
        int i11 = this.f78367ts.lineno;
        if (peekToken == -1) {
            consumeToken();
            return makeErrorNode();
        }
        if (peekToken != 14) {
            if (peekToken != 126) {
                if (peekToken == 21) {
                    consumeToken();
                    UnaryExpression unaryExpression = new UnaryExpression(28, this.f78367ts.tokenBeg, unaryExpr());
                    unaryExpression.setLineno(i11);
                    return unaryExpression;
                }
                if (peekToken == 22) {
                    consumeToken();
                    UnaryExpression unaryExpression2 = new UnaryExpression(29, this.f78367ts.tokenBeg, unaryExpr());
                    unaryExpression2.setLineno(i11);
                    return unaryExpression2;
                }
                if (peekToken != 26 && peekToken != 27) {
                    if (peekToken == 31) {
                        consumeToken();
                        UnaryExpression unaryExpression3 = new UnaryExpression(peekToken, this.f78367ts.tokenBeg, unaryExpr());
                        unaryExpression3.setLineno(i11);
                        return unaryExpression3;
                    }
                    if (peekToken != 32) {
                        if (peekToken == 106 || peekToken == 107) {
                            consumeToken();
                            UnaryExpression unaryExpression4 = new UnaryExpression(peekToken, this.f78367ts.tokenBeg, memberExpr(true));
                            unaryExpression4.setLineno(i11);
                            checkBadIncDec(unaryExpression4);
                            return unaryExpression4;
                        }
                    }
                }
            }
            consumeToken();
            UnaryExpression unaryExpression5 = new UnaryExpression(peekToken, this.f78367ts.tokenBeg, unaryExpr());
            unaryExpression5.setLineno(i11);
            return unaryExpression5;
        }
        if (this.compilerEnv.isXmlAvailable()) {
            consumeToken();
            return memberExprTail(true, xmlInitializer());
        }
        AstNode memberExpr = memberExpr(true);
        int peekTokenOrEOL = peekTokenOrEOL();
        if (peekTokenOrEOL != 106 && peekTokenOrEOL != 107) {
            return memberExpr;
        }
        consumeToken();
        UnaryExpression unaryExpression6 = new UnaryExpression(peekTokenOrEOL, this.f78367ts.tokenBeg, memberExpr, true);
        unaryExpression6.setLineno(i11);
        checkBadIncDec(unaryExpression6);
        return unaryExpression6;
    }

    private VariableDeclaration variables(int i11, int i12, boolean z11) throws IOException {
        AstNode destructuringPrimaryExpr;
        int i13;
        Name name;
        VariableDeclaration variableDeclaration = new VariableDeclaration(i12);
        variableDeclaration.setType(i11);
        variableDeclaration.setLineno(this.f78367ts.lineno);
        Comment andResetJsDoc = getAndResetJsDoc();
        if (andResetJsDoc != null) {
            variableDeclaration.setJsDocNode(andResetJsDoc);
        }
        do {
            int peekToken = peekToken();
            TokenStream tokenStream = this.f78367ts;
            int i14 = tokenStream.tokenBeg;
            int i15 = tokenStream.tokenEnd;
            AstNode astNode = null;
            if (peekToken == 83 || peekToken == 85) {
                destructuringPrimaryExpr = destructuringPrimaryExpr();
                int nodeEnd = getNodeEnd(destructuringPrimaryExpr);
                if (!(destructuringPrimaryExpr instanceof DestructuringForm)) {
                    reportError("msg.bad.assign.left", i14, nodeEnd - i14);
                }
                markDestructuring(destructuringPrimaryExpr);
                i13 = nodeEnd;
                name = null;
            } else {
                mustMatchToken(39, "msg.bad.var");
                Name createNameNode = createNameNode();
                createNameNode.setLineno(this.f78367ts.getLineno());
                if (this.inUseStrictDirective) {
                    String string = this.f78367ts.getString();
                    if ("eval".equals(string) || "arguments".equals(this.f78367ts.getString())) {
                        reportError("msg.bad.id.strict", string);
                    }
                }
                defineSymbol(i11, this.f78367ts.getString(), this.inForInit);
                i13 = i15;
                name = createNameNode;
                destructuringPrimaryExpr = null;
            }
            int i16 = this.f78367ts.lineno;
            Comment andResetJsDoc2 = getAndResetJsDoc();
            if (matchToken(90)) {
                astNode = assignExpr();
                i13 = getNodeEnd(astNode);
            }
            VariableInitializer variableInitializer = new VariableInitializer(i14, i13 - i14);
            if (destructuringPrimaryExpr != null) {
                if (astNode == null && !this.inForInit) {
                    reportError("msg.destruct.assign.no.init");
                }
                variableInitializer.setTarget(destructuringPrimaryExpr);
            } else {
                variableInitializer.setTarget(name);
            }
            variableInitializer.setInitializer(astNode);
            variableInitializer.setType(i11);
            variableInitializer.setJsDocNode(andResetJsDoc2);
            variableInitializer.setLineno(i16);
            variableDeclaration.addVariable(variableInitializer);
        } while (matchToken(89));
        variableDeclaration.setLength(i13 - i12);
        variableDeclaration.setIsStatement(z11);
        return variableDeclaration;
    }

    private void warnMissingSemi(int i11, int i12) {
        if (this.compilerEnv.isStrictMode()) {
            int max = Math.max(i11, lineBeginningFor(i12));
            if (i12 == -1) {
                i12 = this.f78367ts.cursor;
            }
            addStrictWarning("msg.missing.semi", "", max, i12 - max);
        }
    }

    private void warnTrailingComma(int i11, List<?> list, int i12) {
        if (this.compilerEnv.getWarnTrailingComma()) {
            if (!list.isEmpty()) {
                i11 = ((AstNode) list.get(0)).getPosition();
            }
            int max = Math.max(i11, lineBeginningFor(i12));
            addWarning("msg.extra.trailing.comma", max, i12 - max);
        }
    }

    private WhileLoop whileLoop() throws IOException {
        if (this.currentToken != 117) {
            codeBug();
        }
        consumeToken();
        int i11 = this.f78367ts.tokenBeg;
        WhileLoop whileLoop = new WhileLoop(i11);
        whileLoop.setLineno(this.f78367ts.lineno);
        enterLoop(whileLoop);
        try {
            ConditionData condition = condition();
            whileLoop.setCondition(condition.condition);
            whileLoop.setParens(condition.f78368lp - i11, condition.f78369rp - i11);
            AstNode statement = statement();
            whileLoop.setLength(getNodeEnd(statement) - i11);
            whileLoop.setBody(statement);
            return whileLoop;
        } finally {
            exitLoop();
        }
    }

    private WithStatement withStatement() throws IOException {
        if (this.currentToken != 123) {
            codeBug();
        }
        consumeToken();
        Comment andResetJsDoc = getAndResetJsDoc();
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.lineno;
        int i12 = tokenStream.tokenBeg;
        int i13 = mustMatchToken(87, "msg.no.paren.with") ? this.f78367ts.tokenBeg : -1;
        AstNode expr = expr();
        int i14 = mustMatchToken(88, "msg.no.paren.after.with") ? this.f78367ts.tokenBeg : -1;
        AstNode statement = statement();
        WithStatement withStatement = new WithStatement(i12, getNodeEnd(statement) - i12);
        withStatement.setJsDocNode(andResetJsDoc);
        withStatement.setExpression(expr);
        withStatement.setStatement(statement);
        withStatement.setParens(i13, i14);
        withStatement.setLineno(i11);
        return withStatement;
    }

    private XmlElemRef xmlElemRef(int i11, Name name, int i12) throws IOException {
        int i13 = this.f78367ts.tokenBeg;
        int i14 = -1;
        int i15 = i11 != -1 ? i11 : i13;
        AstNode expr = expr();
        int nodeEnd = getNodeEnd(expr);
        if (mustMatchToken(84, "msg.no.bracket.index")) {
            TokenStream tokenStream = this.f78367ts;
            int i16 = tokenStream.tokenBeg;
            nodeEnd = tokenStream.tokenEnd;
            i14 = i16;
        }
        XmlElemRef xmlElemRef = new XmlElemRef(i15, nodeEnd - i15);
        xmlElemRef.setNamespace(name);
        xmlElemRef.setColonPos(i12);
        xmlElemRef.setAtPos(i11);
        xmlElemRef.setExpression(expr);
        xmlElemRef.setBrackets(i13, i14);
        return xmlElemRef;
    }

    private AstNode xmlInitializer() throws IOException {
        if (this.currentToken != 14) {
            codeBug();
        }
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        int firstXMLToken = tokenStream.getFirstXMLToken();
        if (firstXMLToken != 145 && firstXMLToken != 148) {
            reportError("msg.syntax");
            return makeErrorNode();
        }
        XmlLiteral xmlLiteral = new XmlLiteral(i11);
        xmlLiteral.setLineno(this.f78367ts.lineno);
        while (firstXMLToken == 145) {
            TokenStream tokenStream2 = this.f78367ts;
            xmlLiteral.addFragment(new XmlString(tokenStream2.tokenBeg, tokenStream2.getString()));
            mustMatchToken(85, "msg.syntax");
            int i12 = this.f78367ts.tokenBeg;
            AstNode emptyExpression = peekToken() == 86 ? new EmptyExpression(i12, this.f78367ts.tokenEnd - i12) : expr();
            mustMatchToken(86, "msg.syntax");
            XmlExpression xmlExpression = new XmlExpression(i12, emptyExpression);
            xmlExpression.setIsXmlAttribute(this.f78367ts.isXMLAttribute());
            xmlExpression.setLength(this.f78367ts.tokenEnd - i12);
            xmlLiteral.addFragment(xmlExpression);
            firstXMLToken = this.f78367ts.getNextXMLToken();
        }
        if (firstXMLToken != 148) {
            reportError("msg.syntax");
            return makeErrorNode();
        }
        TokenStream tokenStream3 = this.f78367ts;
        xmlLiteral.addFragment(new XmlString(tokenStream3.tokenBeg, tokenStream3.getString()));
        return xmlLiteral;
    }

    public void addError(String str) {
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        addError(str, i11, tokenStream.tokenEnd - i11);
    }

    public void addStrictWarning(String str, String str2) {
        int i11;
        int i12;
        TokenStream tokenStream = this.f78367ts;
        if (tokenStream != null) {
            i11 = tokenStream.tokenBeg;
            i12 = tokenStream.tokenEnd - i11;
        } else {
            i11 = -1;
            i12 = -1;
        }
        addStrictWarning(str, str2, i11, i12);
    }

    public void addWarning(String str, String str2) {
        int i11;
        int i12;
        TokenStream tokenStream = this.f78367ts;
        if (tokenStream != null) {
            i11 = tokenStream.tokenBeg;
            i12 = tokenStream.tokenEnd - i11;
        } else {
            i11 = -1;
            i12 = -1;
        }
        addWarning(str, str2, i11, i12);
    }

    public void checkActivationName(String str, int i11) {
        if (insideFunction()) {
            if ("arguments".equals(str) || ((this.compilerEnv.getActivationNames() != null && this.compilerEnv.getActivationNames().contains(str)) || ("length".equals(str) && i11 == 33 && this.compilerEnv.getLanguageVersion() == 120))) {
                setRequiresActivation();
            }
        }
    }

    public void checkMutableReference(Node node) {
        if ((node.getIntProp(16, 0) & 4) != 0) {
            reportError("msg.bad.assign.left");
        }
    }

    public Node createDestructuringAssignment(int i11, Node node, Node node2) {
        String nextTempName = this.currentScriptOrFn.getNextTempName();
        Node destructuringAssignmentHelper = destructuringAssignmentHelper(i11, node, node2, nextTempName);
        destructuringAssignmentHelper.getLastChild().addChildToBack(createName(nextTempName));
        return destructuringAssignmentHelper;
    }

    public Node createName(String str) {
        checkActivationName(str, 39);
        return Node.newString(39, str);
    }

    public Node createNumber(double d11) {
        return Node.newNumber(d11);
    }

    public Scope createScopeNode(int i11, int i12) {
        Scope scope = new Scope();
        scope.setType(i11);
        scope.setLineno(i12);
        return scope;
    }

    public void defineSymbol(int i11, String str) {
        defineSymbol(i11, str, false);
    }

    public boolean destructuringArray(ArrayLiteral arrayLiteral, int i11, String str, Node node, List<String> list) {
        int i12 = i11 == 154 ? 155 : 8;
        int i13 = 0;
        boolean z11 = true;
        for (AstNode astNode : arrayLiteral.getElements()) {
            if (astNode.getType() == 128) {
                i13++;
            } else {
                Node node2 = new Node(36, createName(str), createNumber(i13));
                if (astNode.getType() == 39) {
                    String string = astNode.getString();
                    node.addChildToBack(new Node(i12, createName(49, string, null), node2));
                    if (i11 != -1) {
                        defineSymbol(i11, string, true);
                        list.add(string);
                    }
                } else {
                    node.addChildToBack(destructuringAssignmentHelper(i11, astNode, node2, this.currentScriptOrFn.getNextTempName()));
                }
                i13++;
                z11 = false;
            }
        }
        return z11;
    }

    public Node destructuringAssignmentHelper(int i11, Node node, Node node2, String str) {
        Scope createScopeNode = createScopeNode(158, node.getLineno());
        createScopeNode.addChildToFront(new Node(153, createName(39, str, node2)));
        try {
            pushScope(createScopeNode);
            boolean z11 = true;
            defineSymbol(153, str, true);
            popScope();
            Node node3 = new Node(89);
            createScopeNode.addChildToBack(node3);
            List<String> arrayList = new ArrayList<>();
            int type = node.getType();
            if (type == 33 || type == 36) {
                if (i11 == 122 || i11 == 153 || i11 == 154) {
                    reportError("msg.bad.assign.left");
                }
                node3.addChildToBack(simpleAssignment(node, createName(str)));
            } else if (type == 65) {
                z11 = destructuringArray((ArrayLiteral) node, i11, str, node3, arrayList);
            } else if (type != 66) {
                reportError("msg.bad.assign.left");
            } else {
                z11 = destructuringObject((ObjectLiteral) node, i11, str, node3, arrayList);
            }
            if (z11) {
                node3.addChildToBack(createNumber(0.0d));
            }
            createScopeNode.putProp(22, arrayList);
            return createScopeNode;
        } catch (Throwable th2) {
            popScope();
            throw th2;
        }
    }

    public boolean destructuringObject(ObjectLiteral objectLiteral, int i11, String str, Node node, List<String> list) {
        Node node2;
        int i12 = i11 == 154 ? 155 : 8;
        boolean z11 = true;
        for (ObjectProperty objectProperty : objectLiteral.getElements()) {
            TokenStream tokenStream = this.f78367ts;
            int i13 = tokenStream != null ? tokenStream.lineno : 0;
            AstNode left = objectProperty.getLeft();
            if (left instanceof Name) {
                node2 = new Node(33, createName(str), Node.newString(((Name) left).getIdentifier()));
            } else if (left instanceof StringLiteral) {
                node2 = new Node(33, createName(str), Node.newString(((StringLiteral) left).getValue()));
            } else {
                if (!(left instanceof NumberLiteral)) {
                    throw codeBug();
                }
                node2 = new Node(36, createName(str), createNumber((int) ((NumberLiteral) left).getNumber()));
            }
            node2.setLineno(i13);
            AstNode right = objectProperty.getRight();
            if (right.getType() == 39) {
                String identifier = ((Name) right).getIdentifier();
                node.addChildToBack(new Node(i12, createName(49, identifier, null), node2));
                if (i11 != -1) {
                    defineSymbol(i11, identifier, true);
                    list.add(identifier);
                }
            } else {
                node.addChildToBack(destructuringAssignmentHelper(i11, right, node2, this.currentScriptOrFn.getNextTempName()));
            }
            z11 = false;
        }
        return z11;
    }

    public boolean eof() {
        return this.f78367ts.eof();
    }

    public boolean insideFunction() {
        return this.nestingOfFunction != 0;
    }

    public String lookupMessage(String str) {
        return lookupMessage(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void markDestructuring(AstNode astNode) {
        if (astNode instanceof DestructuringForm) {
            ((DestructuringForm) astNode).setIsDestructuring(true);
        } else if (astNode instanceof ParenthesizedExpression) {
            markDestructuring(((ParenthesizedExpression) astNode).getExpression());
        }
    }

    public AstRoot parse(String str, String str2, int i11) {
        if (this.parseFinished) {
            throw new IllegalStateException("parser reused");
        }
        this.sourceURI = str2;
        if (this.compilerEnv.isIdeMode()) {
            this.sourceChars = str.toCharArray();
        }
        this.f78367ts = new TokenStream(this, null, str, i11);
        try {
            try {
                return parse();
            } catch (IOException unused) {
                throw new IllegalStateException();
            }
        } finally {
            this.parseFinished = true;
        }
    }

    public void popScope() {
        this.currentScope = this.currentScope.getParentScope();
    }

    public void pushScope(Scope scope) {
        Scope parentScope = scope.getParentScope();
        if (parentScope == null) {
            this.currentScope.addChildScope(scope);
        } else if (parentScope != this.currentScope) {
            codeBug();
        }
        this.currentScope = scope;
    }

    public AstNode removeParens(AstNode astNode) {
        while (astNode instanceof ParenthesizedExpression) {
            astNode = ((ParenthesizedExpression) astNode).getExpression();
        }
        return astNode;
    }

    public void reportError(String str) {
        reportError(str, null);
    }

    public void setIsGenerator() {
        if (insideFunction()) {
            ((FunctionNode) this.currentScriptOrFn).setIsGenerator();
        }
    }

    public void setRequiresActivation() {
        if (insideFunction()) {
            ((FunctionNode) this.currentScriptOrFn).setRequiresActivation();
        }
    }

    public Node simpleAssignment(Node node, Node node2) {
        Node firstChild;
        Node lastChild;
        int i11;
        int type = node.getType();
        if (type != 33 && type != 36) {
            if (type != 39) {
                if (type != 67) {
                    throw codeBug();
                }
                Node firstChild2 = node.getFirstChild();
                checkMutableReference(firstChild2);
                return new Node(68, firstChild2, node2);
            }
            if (this.inUseStrictDirective) {
                Name name = (Name) node;
                if ("eval".equals(name.getIdentifier())) {
                    reportError("msg.bad.id.strict", name.getIdentifier());
                }
            }
            node.setType(49);
            return new Node(8, node, node2);
        }
        if (node instanceof PropertyGet) {
            PropertyGet propertyGet = (PropertyGet) node;
            firstChild = propertyGet.getTarget();
            lastChild = propertyGet.getProperty();
        } else if (node instanceof ElementGet) {
            ElementGet elementGet = (ElementGet) node;
            firstChild = elementGet.getTarget();
            lastChild = elementGet.getElement();
        } else {
            firstChild = node.getFirstChild();
            lastChild = node.getLastChild();
        }
        if (type == 33) {
            lastChild.setType(41);
            i11 = 35;
        } else {
            i11 = 37;
        }
        return new Node(i11, firstChild, lastChild, node2);
    }

    public Parser(CompilerEnvirons compilerEnvirons) {
        this(compilerEnvirons, compilerEnvirons.getErrorReporter());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.Name createNameNode(boolean r6, int r7) {
        /*
            r5 = this;
            org.mozilla.javascript.TokenStream r0 = r5.f78367ts
            int r1 = r0.tokenBeg
            java.lang.String r0 = r0.getString()
            org.mozilla.javascript.TokenStream r2 = r5.f78367ts
            int r2 = r2.lineno
            java.lang.String r3 = r5.prevNameTokenString
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L23
            int r1 = r5.prevNameTokenStart
            java.lang.String r0 = r5.prevNameTokenString
            int r2 = r5.prevNameTokenLineno
            r3 = 0
            r5.prevNameTokenStart = r3
            r5.prevNameTokenString = r4
            r5.prevNameTokenLineno = r3
        L23:
            if (r0 != 0) goto L31
            org.mozilla.javascript.CompilerEnvirons r3 = r5.compilerEnv
            boolean r3 = r3.isIdeMode()
            if (r3 == 0) goto L2e
            goto L32
        L2e:
            r5.codeBug()
        L31:
            r4 = r0
        L32:
            org.mozilla.javascript.ast.Name r0 = new org.mozilla.javascript.ast.Name
            r0.<init>(r1, r4)
            r0.setLineno(r2)
            if (r6 == 0) goto L3f
            r5.checkActivationName(r4, r7)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.createNameNode(boolean, int):org.mozilla.javascript.ast.Name");
    }

    private AstNode generatorExpression(AstNode astNode, int i11, boolean z11) throws IOException {
        int i12;
        ConditionData conditionData;
        ArrayList arrayList = new ArrayList();
        while (peekToken() == 119) {
            arrayList.add(generatorExpressionLoop());
        }
        if (peekToken() == 112) {
            consumeToken();
            i12 = this.f78367ts.tokenBeg - i11;
            conditionData = condition();
        } else {
            i12 = -1;
            conditionData = null;
        }
        if (!z11) {
            mustMatchToken(88, "msg.no.paren.let");
        }
        GeneratorExpression generatorExpression = new GeneratorExpression(i11, this.f78367ts.tokenEnd - i11);
        generatorExpression.setResult(astNode);
        generatorExpression.setLoops(arrayList);
        if (conditionData != null) {
            generatorExpression.setIfPosition(i12);
            generatorExpression.setFilter(conditionData.condition);
            generatorExpression.setFilterLp(conditionData.f78368lp - i11);
            generatorExpression.setFilterRp(conditionData.f78369rp - i11);
        }
        return generatorExpression;
    }

    private boolean mustMatchToken(int i11, String str, int i12, int i13) throws IOException {
        if (matchToken(i11)) {
            return true;
        }
        reportError(str, i12, i13);
        return false;
    }

    public void addError(String str, int i11, int i12) {
        addError(str, null, i11, i12);
    }

    public void defineSymbol(int i11, String str, boolean z11) {
        if (str == null) {
            if (this.compilerEnv.isIdeMode()) {
                return;
            } else {
                codeBug();
            }
        }
        Scope definingScope = this.currentScope.getDefiningScope(str);
        Symbol symbol = definingScope != null ? definingScope.getSymbol(str) : null;
        int declType = symbol != null ? symbol.getDeclType() : -1;
        String str2 = "msg.var.redecl";
        if (symbol != null && (declType == 154 || i11 == 154 || (definingScope == this.currentScope && declType == 153))) {
            if (declType == 154) {
                str2 = "msg.const.redecl";
            } else if (declType == 153) {
                str2 = "msg.let.redecl";
            } else if (declType != 122) {
                str2 = declType == 109 ? "msg.fn.redecl" : "msg.parm.redecl";
            }
            addError(str2, str);
            return;
        }
        if (i11 == 87) {
            if (symbol != null) {
                addWarning("msg.dup.parms", str);
            }
            this.currentScriptOrFn.putSymbol(new Symbol(i11, str));
            return;
        }
        if (i11 != 109 && i11 != 122) {
            if (i11 == 153) {
                if (z11 || !(this.currentScope.getType() == 112 || (this.currentScope instanceof Loop))) {
                    this.currentScope.putSymbol(new Symbol(i11, str));
                    return;
                } else {
                    addError("msg.let.decl.not.in.block");
                    return;
                }
            }
            if (i11 != 154) {
                throw codeBug();
            }
        }
        if (symbol == null) {
            this.currentScriptOrFn.putSymbol(new Symbol(i11, str));
        } else if (declType == 122) {
            addStrictWarning("msg.var.redecl", str);
        } else if (declType == 87) {
            addStrictWarning("msg.var.hides.arg", str);
        }
    }

    public String lookupMessage(String str, String str2) {
        return str2 == null ? ScriptRuntime.getMessage0(str) : ScriptRuntime.getMessage1(str, str2);
    }

    public void reportError(String str, String str2) {
        TokenStream tokenStream = this.f78367ts;
        if (tokenStream == null) {
            reportError(str, str2, 1, 1);
        } else {
            int i11 = tokenStream.tokenBeg;
            reportError(str, str2, i11, tokenStream.tokenEnd - i11);
        }
    }

    public Parser(CompilerEnvirons compilerEnvirons, ErrorReporter errorReporter) {
        this.currentFlaggedToken = 0;
        this.prevNameTokenString = "";
        this.compilerEnv = compilerEnvirons;
        this.errorReporter = errorReporter;
        if (errorReporter instanceof IdeErrorReporter) {
            this.errorCollector = (IdeErrorReporter) errorReporter;
        }
    }

    public void addError(String str, String str2) {
        TokenStream tokenStream = this.f78367ts;
        int i11 = tokenStream.tokenBeg;
        addError(str, str2, i11, tokenStream.tokenEnd - i11);
    }

    public Node createName(int i11, String str, Node node) {
        Node createName = createName(str);
        createName.setType(i11);
        if (node != null) {
            createName.addChildToBack(node);
        }
        return createName;
    }

    public void addError(String str, String str2, int i11, int i12) {
        String str3;
        int i13;
        int i14;
        this.syntaxErrorCount++;
        String lookupMessage = lookupMessage(str, str2);
        IdeErrorReporter ideErrorReporter = this.errorCollector;
        if (ideErrorReporter != null) {
            ideErrorReporter.error(lookupMessage, this.sourceURI, i11, i12);
            return;
        }
        TokenStream tokenStream = this.f78367ts;
        if (tokenStream != null) {
            int lineno = tokenStream.getLineno();
            str3 = this.f78367ts.getLine();
            i14 = this.f78367ts.getOffset();
            i13 = lineno;
        } else {
            str3 = "";
            i13 = 1;
            i14 = 1;
        }
        this.errorReporter.error(lookupMessage, this.sourceURI, i13, str3, i14);
    }

    public void addStrictWarning(String str, String str2, int i11, int i12) {
        if (this.compilerEnv.isStrictMode()) {
            addWarning(str, str2, i11, i12);
        }
    }

    public void addWarning(String str, int i11, int i12) {
        addWarning(str, null, i11, i12);
    }

    public void reportError(String str, int i11, int i12) {
        reportError(str, null, i11, i12);
    }

    public void addWarning(String str, String str2, int i11, int i12) {
        String lookupMessage = lookupMessage(str, str2);
        if (this.compilerEnv.reportWarningAsError()) {
            addError(str, str2, i11, i12);
            return;
        }
        IdeErrorReporter ideErrorReporter = this.errorCollector;
        if (ideErrorReporter != null) {
            ideErrorReporter.warning(lookupMessage, this.sourceURI, i11, i12);
        } else {
            this.errorReporter.warning(lookupMessage, this.sourceURI, this.f78367ts.getLineno(), this.f78367ts.getLine(), this.f78367ts.getOffset());
        }
    }

    public void reportError(String str, String str2, int i11, int i12) {
        addError(str, i11, i12);
        if (!this.compilerEnv.recoverFromErrors()) {
            throw new ParserException();
        }
    }

    private AstNode statements() throws IOException {
        return statements(null);
    }

    public AstRoot parse(Reader reader, String str, int i11) throws IOException {
        if (!this.parseFinished) {
            if (this.compilerEnv.isIdeMode()) {
                return parse(readFully(reader), str, i11);
            }
            try {
                this.sourceURI = str;
                this.f78367ts = new TokenStream(this, reader, null, i11);
                return parse();
            } finally {
                this.parseFinished = true;
            }
        }
        throw new IllegalStateException("parser reused");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ast.AstRoot parse() throws java.io.IOException {
        /*
            r10 = this;
            org.mozilla.javascript.ast.AstRoot r0 = new org.mozilla.javascript.ast.AstRoot
            r1 = 0
            r0.<init>(r1)
            r10.currentScriptOrFn = r0
            r10.currentScope = r0
            org.mozilla.javascript.TokenStream r2 = r10.f78367ts
            int r6 = r2.lineno
            boolean r2 = r10.inUseStrictDirective
            r10.inUseStrictDirective = r1
            r3 = 1
            r5 = r1
            r4 = r3
        L15:
            int r7 = r10.peekToken()     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            if (r7 > 0) goto L1c
            goto L32
        L1c:
            r8 = 109(0x6d, float:1.53E-43)
            if (r7 != r8) goto L35
            r10.consumeToken()     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            boolean r7 = r10.calledByCompileFunction     // Catch: java.lang.Throwable -> L2f org.mozilla.javascript.Parser.ParserException -> L32 java.lang.StackOverflowError -> L5b
            if (r7 == 0) goto L29
            r7 = 2
            goto L2a
        L29:
            r7 = r3
        L2a:
            org.mozilla.javascript.ast.FunctionNode r7 = r10.function(r7)     // Catch: java.lang.Throwable -> L2f org.mozilla.javascript.Parser.ParserException -> L32 java.lang.StackOverflowError -> L5b
            goto L50
        L2f:
            r0 = move-exception
            goto Lda
        L32:
            r10.inUseStrictDirective = r2
            goto L6a
        L35:
            org.mozilla.javascript.ast.AstNode r7 = r10.statement()     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            if (r4 == 0) goto L50
            java.lang.String r8 = r10.getDirective(r7)     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            if (r8 != 0) goto L43
            r4 = r1
            goto L50
        L43:
            java.lang.String r9 = "use strict"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            if (r8 == 0) goto L50
            r10.inUseStrictDirective = r3     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            r0.setInStrictMode(r3)     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
        L50:
            int r5 = r10.getNodeEnd(r7)     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            r0.addChildToBack(r7)     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            r7.setParent(r0)     // Catch: java.lang.Throwable -> L2f java.lang.StackOverflowError -> L5b
            goto L15
        L5b:
            java.lang.String r4 = "msg.too.deep.parser.recursion"
            java.lang.String r4 = r10.lookupMessage(r4)     // Catch: java.lang.Throwable -> L2f
            org.mozilla.javascript.CompilerEnvirons r7 = r10.compilerEnv     // Catch: java.lang.Throwable -> L2f
            boolean r7 = r7.isIdeMode()     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto Lce
            goto L32
        L6a:
            int r1 = r10.syntaxErrorCount
            if (r1 == 0) goto L8c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "msg.got.syntax.errors"
            java.lang.String r4 = r10.lookupMessage(r2, r1)
            org.mozilla.javascript.CompilerEnvirons r1 = r10.compilerEnv
            boolean r1 = r1.isIdeMode()
            if (r1 == 0) goto L81
            goto L8c
        L81:
            org.mozilla.javascript.ErrorReporter r3 = r10.errorReporter
            java.lang.String r5 = r10.sourceURI
            r7 = 0
            r8 = 0
            org.mozilla.javascript.EvaluatorException r0 = r3.runtimeError(r4, r5, r6, r7, r8)
            throw r0
        L8c:
            java.util.List<org.mozilla.javascript.ast.Comment> r1 = r10.scannedComments
            if (r1 == 0) goto Lbb
            int r1 = r1.size()
            int r1 = r1 - r3
            java.util.List<org.mozilla.javascript.ast.Comment> r2 = r10.scannedComments
            java.lang.Object r1 = r2.get(r1)
            org.mozilla.javascript.ast.AstNode r1 = (org.mozilla.javascript.ast.AstNode) r1
            int r1 = r10.getNodeEnd(r1)
            int r5 = java.lang.Math.max(r5, r1)
            java.util.List<org.mozilla.javascript.ast.Comment> r1 = r10.scannedComments
            java.util.Iterator r1 = r1.iterator()
        Lab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r1.next()
            org.mozilla.javascript.ast.Comment r2 = (org.mozilla.javascript.ast.Comment) r2
            r0.addComment(r2)
            goto Lab
        Lbb:
            r0.setLength(r5)
            java.lang.String r1 = r10.sourceURI
            r0.setSourceName(r1)
            r0.setBaseLineno(r6)
            org.mozilla.javascript.TokenStream r1 = r10.f78367ts
            int r1 = r1.lineno
            r0.setEndLineno(r1)
            return r0
        Lce:
            java.lang.String r0 = r10.sourceURI     // Catch: java.lang.Throwable -> L2f
            org.mozilla.javascript.TokenStream r3 = r10.f78367ts     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.lineno     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            org.mozilla.javascript.EvaluatorException r0 = org.mozilla.javascript.Context.reportRuntimeError(r4, r0, r3, r5, r1)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        Lda:
            r10.inUseStrictDirective = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Parser.parse():org.mozilla.javascript.ast.AstRoot");
    }
}
