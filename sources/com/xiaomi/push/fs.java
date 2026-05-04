package com.xiaomi.push;

/* loaded from: classes8.dex */
class fs extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fr f45579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(fr frVar, String str) {
        super(str);
        this.f45579a = frVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        fm fmVar;
        try {
            fmVar = this.f45579a.f45578a;
            fmVar.m5952a();
        } catch (Exception e11) {
            this.f45579a.c(9, e11);
        }
    }
}
