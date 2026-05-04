package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.ast.ParseProblem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ErrorCollector implements IdeErrorReporter {
    private List<ParseProblem> errors = new ArrayList();

    @Override // org.mozilla.javascript.ErrorReporter
    public void error(String str, String str2, int i11, String str3, int i12) {
        throw new UnsupportedOperationException();
    }

    public List<ParseProblem> getErrors() {
        return this.errors;
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public EvaluatorException runtimeError(String str, String str2, int i11, String str3, int i12) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.errors.size() * 100);
        Iterator<ParseProblem> it = this.errors.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void warning(String str, String str2, int i11, String str3, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.ast.IdeErrorReporter
    public void error(String str, String str2, int i11, int i12) {
        this.errors.add(new ParseProblem(ParseProblem.Type.Error, str, str2, i11, i12));
    }

    @Override // org.mozilla.javascript.ast.IdeErrorReporter
    public void warning(String str, String str2, int i11, int i12) {
        this.errors.add(new ParseProblem(ParseProblem.Type.Warning, str, str2, i11, i12));
    }
}
