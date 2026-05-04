package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ErrorReporter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ShellContextFactory extends ContextFactory {
    private String characterEncoding;
    private ErrorReporter errorReporter;
    private boolean generatingDebug;
    private int optimizationLevel;
    private boolean strictMode;
    private boolean warningAsError;
    private int languageVersion = 170;
    private boolean allowReservedKeywords = true;

    public String getCharacterEncoding() {
        return this.characterEncoding;
    }

    @Override // org.mozilla.javascript.ContextFactory
    public boolean hasFeature(Context context, int i11) {
        if (i11 == 3) {
            return this.allowReservedKeywords;
        }
        switch (i11) {
            case 8:
            case 9:
            case 11:
                return this.strictMode;
            case 10:
                return this.generatingDebug;
            case 12:
                return this.warningAsError;
            default:
                return super.hasFeature(context, i11);
        }
    }

    @Override // org.mozilla.javascript.ContextFactory
    public void onContextCreated(Context context) {
        context.setLanguageVersion(this.languageVersion);
        context.setOptimizationLevel(this.optimizationLevel);
        ErrorReporter errorReporter = this.errorReporter;
        if (errorReporter != null) {
            context.setErrorReporter(errorReporter);
        }
        context.setGeneratingDebug(this.generatingDebug);
        super.onContextCreated(context);
    }

    public void setAllowReservedKeywords(boolean z11) {
        this.allowReservedKeywords = z11;
    }

    public void setCharacterEncoding(String str) {
        this.characterEncoding = str;
    }

    public void setErrorReporter(ErrorReporter errorReporter) {
        if (errorReporter == null) {
            throw new IllegalArgumentException();
        }
        this.errorReporter = errorReporter;
    }

    public void setGeneratingDebug(boolean z11) {
        this.generatingDebug = z11;
    }

    public void setLanguageVersion(int i11) {
        Context.checkLanguageVersion(i11);
        checkNotSealed();
        this.languageVersion = i11;
    }

    public void setOptimizationLevel(int i11) {
        Context.checkOptimizationLevel(i11);
        checkNotSealed();
        this.optimizationLevel = i11;
    }

    public void setStrictMode(boolean z11) {
        checkNotSealed();
        this.strictMode = z11;
    }

    public void setWarningAsError(boolean z11) {
        checkNotSealed();
        this.warningAsError = z11;
    }
}
