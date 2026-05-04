package com.baicizhan.main.word_book.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.baicizhan.main.word_book.service.WordFavoriteService;
import kotlin.jvm.internal.v;
import m80.l;
import qb.c;
import rj.e;
import rj.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final e f27727a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@l ComponentName componentName, @l IBinder iBinder) {
        e eVar = this.f27727a;
        if (eVar != null) {
            WordFavoriteService.c cVar = iBinder instanceof WordFavoriteService.c ? (WordFavoriteService.c) iBinder : null;
            if (cVar == null) {
                return;
            }
            eVar.a(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@l ComponentName componentName) {
        c.i(f.f84224a, "favorite service disconnected", new Object[0]);
    }

    public a(@l e eVar) {
        this.f27727a = eVar;
    }

    public /* synthetic */ a(e eVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : eVar);
    }
}
