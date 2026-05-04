package com.tencent.liteav.basic;

import com.tencent.liteav.TXLiteAVExternalDecoderFactoryInterface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static TXLiteAVExternalDecoderFactoryInterface f43113a;

    public static synchronized boolean a() {
        synchronized (a.class) {
            return f43113a != null;
        }
    }

    public static synchronized TXLiteAVExternalDecoderFactoryInterface b() {
        TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface;
        synchronized (a.class) {
            tXLiteAVExternalDecoderFactoryInterface = f43113a;
        }
        return tXLiteAVExternalDecoderFactoryInterface;
    }

    public static synchronized void a(TXLiteAVExternalDecoderFactoryInterface tXLiteAVExternalDecoderFactoryInterface) {
        synchronized (a.class) {
            f43113a = tXLiteAVExternalDecoderFactoryInterface;
        }
    }
}
