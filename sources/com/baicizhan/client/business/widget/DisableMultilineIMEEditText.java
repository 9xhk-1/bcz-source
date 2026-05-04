package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DisableMultilineIMEEditText extends AppCompatEditText {
    public DisableMultilineIMEEditText(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        outAttrs.imeOptions ^= 1073741824;
        return onCreateInputConnection;
    }

    public DisableMultilineIMEEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DisableMultilineIMEEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
