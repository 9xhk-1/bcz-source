package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f32347a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32348b;

    public TextInputEditText(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @NonNull
    public final String a(@NonNull TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean isEmpty = TextUtils.isEmpty(text);
        String str = "";
        String charSequence = !TextUtils.isEmpty(hint) ? hint.toString() : "";
        if (isEmpty) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = j2.O + charSequence;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public boolean b() {
        return this.f32348b;
    }

    public final boolean c(@Nullable TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f32348b;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@Nullable Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!c(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f32347a);
        rect.bottom = this.f32347a.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@Nullable Rect rect, @Nullable Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!c(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.c0()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.c0() && super.getHint() == null && com.google.android.material.internal.l.d()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@Nullable Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!c(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f32347a.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f32347a);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z11) {
        this.f32348b = z11;
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(zn.a.c(context, attributeSet, i11, 0), attributeSet, i11);
        this.f32347a = new Rect();
        TypedArray k11 = com.google.android.material.internal.d0.k(context, attributeSet, R.styleable.TextInputEditText, i11, R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(k11.getBoolean(R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        k11.recycle();
    }
}
