package androidx.compose.ui.semantics;

import kotlin.jvm.internal.Lambda;
import x00.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1<T> extends Lambda implements p<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // x00.p
    public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
        String label;
        T action;
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
            action = accessibilityAction2.getAction();
        }
        return new AccessibilityAction<>(label, action);
    }
}
