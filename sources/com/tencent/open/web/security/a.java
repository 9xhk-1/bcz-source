package com.tencent.open.web.security;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.open.log.SLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static String f44621a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f44622b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f44623c = false;

    public a(InputConnection inputConnection, boolean z11) {
        super(inputConnection, z11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i11) {
        f44623c = true;
        f44621a = charSequence.toString();
        SLog.v("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SLog.i("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f44621a = String.valueOf((char) keyEvent.getUnicodeChar());
            f44623c = true;
            SLog.d("openSDK_LOG.CaptureInputConnection", "s: " + f44621a);
        }
        SLog.d("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f44621a);
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i11) {
        f44623c = true;
        f44621a = charSequence.toString();
        SLog.v("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i11);
    }
}
