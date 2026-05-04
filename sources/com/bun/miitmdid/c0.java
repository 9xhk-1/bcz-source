package com.bun.miitmdid;

import android.os.AsyncTask;
import com.bun.lib.MsaIdInterface;

/* loaded from: classes6.dex */
public class c0 extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public e0 f28902a;

    /* renamed from: b, reason: collision with root package name */
    public MsaIdInterface f28903b;

    public c0(MsaIdInterface msaIdInterface, e0 e0Var) {
        this.f28903b = msaIdInterface;
        this.f28902a = e0Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public native Boolean doInBackground(Void... voidArr);

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public native void onPostExecute(Boolean bool);
}
