package org.mozilla.javascript;

import java.util.Set;
import org.mozilla.javascript.ast.ErrorCollector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class CompilerEnvirons {
    Set<String> activationNames;
    private boolean ideMode;
    private boolean recordingComments;
    private boolean recordingLocalJsDocComments;
    private boolean recoverFromErrors;
    private boolean warnTrailingComma;
    private ErrorReporter errorReporter = DefaultErrorReporter.instance;
    private int languageVersion = 0;
    private boolean generateDebugInfo = true;
    private boolean reservedKeywordAsIdentifier = true;
    private boolean allowMemberExprAsFunctionName = false;
    private boolean xmlAvailable = true;
    private int optimizationLevel = 0;
    private boolean generatingSource = true;
    private boolean strictMode = false;
    private boolean warningAsError = false;
    private boolean generateObserverCount = false;
    private boolean allowSharpComments = false;

    public static CompilerEnvirons ideEnvirons() {
        CompilerEnvirons compilerEnvirons = new CompilerEnvirons();
        compilerEnvirons.setRecoverFromErrors(true);
        compilerEnvirons.setRecordingComments(true);
        compilerEnvirons.setStrictMode(true);
        compilerEnvirons.setWarnTrailingComma(true);
        compilerEnvirons.setLanguageVersion(170);
        compilerEnvirons.setReservedKeywordAsIdentifier(true);
        compilerEnvirons.setIdeMode(true);
        compilerEnvirons.setErrorReporter(new ErrorCollector());
        return compilerEnvirons;
    }

    public Set<String> getActivationNames() {
        return this.activationNames;
    }

    public boolean getAllowSharpComments() {
        return this.allowSharpComments;
    }

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final int getLanguageVersion() {
        return this.languageVersion;
    }

    public final int getOptimizationLevel() {
        return this.optimizationLevel;
    }

    public boolean getWarnTrailingComma() {
        return this.warnTrailingComma;
    }

    public void initFromContext(Context context) {
        setErrorReporter(context.getErrorReporter());
        this.languageVersion = context.getLanguageVersion();
        this.generateDebugInfo = !context.isGeneratingDebugChanged() || context.isGeneratingDebug();
        this.reservedKeywordAsIdentifier = context.hasFeature(3);
        this.allowMemberExprAsFunctionName = context.hasFeature(2);
        this.strictMode = context.hasFeature(11);
        this.warningAsError = context.hasFeature(12);
        this.xmlAvailable = context.hasFeature(6);
        this.optimizationLevel = context.getOptimizationLevel();
        this.generatingSource = context.isGeneratingSource();
        this.activationNames = context.activationNames;
        this.generateObserverCount = context.generateObserverCount;
    }

    public final boolean isAllowMemberExprAsFunctionName() {
        return this.allowMemberExprAsFunctionName;
    }

    public final boolean isGenerateDebugInfo() {
        return this.generateDebugInfo;
    }

    public boolean isGenerateObserverCount() {
        return this.generateObserverCount;
    }

    public final boolean isGeneratingSource() {
        return this.generatingSource;
    }

    public boolean isIdeMode() {
        return this.ideMode;
    }

    public boolean isRecordingComments() {
        return this.recordingComments;
    }

    public boolean isRecordingLocalJsDocComments() {
        return this.recordingLocalJsDocComments;
    }

    public final boolean isReservedKeywordAsIdentifier() {
        return this.reservedKeywordAsIdentifier;
    }

    public final boolean isStrictMode() {
        return this.strictMode;
    }

    public final boolean isXmlAvailable() {
        return this.xmlAvailable;
    }

    public boolean recoverFromErrors() {
        return this.recoverFromErrors;
    }

    public final boolean reportWarningAsError() {
        return this.warningAsError;
    }

    public void setActivationNames(Set<String> set) {
        this.activationNames = set;
    }

    public void setAllowMemberExprAsFunctionName(boolean z11) {
        this.allowMemberExprAsFunctionName = z11;
    }

    public void setAllowSharpComments(boolean z11) {
        this.allowSharpComments = z11;
    }

    public void setErrorReporter(ErrorReporter errorReporter) {
        if (errorReporter == null) {
            throw new IllegalArgumentException();
        }
        this.errorReporter = errorReporter;
    }

    public void setGenerateDebugInfo(boolean z11) {
        this.generateDebugInfo = z11;
    }

    public void setGenerateObserverCount(boolean z11) {
        this.generateObserverCount = z11;
    }

    public void setGeneratingSource(boolean z11) {
        this.generatingSource = z11;
    }

    public void setIdeMode(boolean z11) {
        this.ideMode = z11;
    }

    public void setLanguageVersion(int i11) {
        Context.checkLanguageVersion(i11);
        this.languageVersion = i11;
    }

    public void setOptimizationLevel(int i11) {
        Context.checkOptimizationLevel(i11);
        this.optimizationLevel = i11;
    }

    public void setRecordingComments(boolean z11) {
        this.recordingComments = z11;
    }

    public void setRecordingLocalJsDocComments(boolean z11) {
        this.recordingLocalJsDocComments = z11;
    }

    public void setRecoverFromErrors(boolean z11) {
        this.recoverFromErrors = z11;
    }

    public void setReservedKeywordAsIdentifier(boolean z11) {
        this.reservedKeywordAsIdentifier = z11;
    }

    public void setStrictMode(boolean z11) {
        this.strictMode = z11;
    }

    public void setWarnTrailingComma(boolean z11) {
        this.warnTrailingComma = z11;
    }

    public void setXmlAvailable(boolean z11) {
        this.xmlAvailable = z11;
    }
}
