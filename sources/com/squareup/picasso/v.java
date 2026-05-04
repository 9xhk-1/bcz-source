package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.h0;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public static final int f41962a = 3;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        public final c f41963a;

        public a(c cVar) {
            super(cVar, null);
            this.f41963a = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            Picasso.Priority r11 = this.f41963a.r();
            Picasso.Priority r12 = aVar.f41963a.r();
            return r11 == r12 ? this.f41963a.f41784a - aVar.f41963a.f41784a : r12.ordinal() - r11.ordinal();
        }
    }

    public v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new h0.c());
    }

    public void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                b(4);
                return;
            } else {
                b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        b(3);
                        break;
                    default:
                        b(3);
                        break;
                }
                return;
        }
        b(2);
    }

    public final void b(int i11) {
        setCorePoolSize(i11);
        setMaximumPoolSize(i11);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
