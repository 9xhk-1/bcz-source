package com.baicizhan.client.fm.service;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.fm.data.FmList;
import com.baicizhan.client.fm.data.FmMidList;
import com.baicizhan.client.fm.data.load.FmLoader;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import kb.f;
import rb.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements IAudioPlayer.b, IAudioPlayer.a, f {

    /* renamed from: p, reason: collision with root package name */
    public static final String f17457p = "FmPlayer";

    /* renamed from: q, reason: collision with root package name */
    public static final int f17458q = 2;

    /* renamed from: a, reason: collision with root package name */
    public Context f17459a;

    /* renamed from: b, reason: collision with root package name */
    public c f17460b;

    /* renamed from: c, reason: collision with root package name */
    public FmLoader<FmList> f17461c;

    /* renamed from: d, reason: collision with root package name */
    public FmLoader<FmMidList> f17462d;

    /* renamed from: e, reason: collision with root package name */
    public int f17463e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17464f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17465g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17466h;

    /* renamed from: i, reason: collision with root package name */
    public int f17467i;

    /* renamed from: j, reason: collision with root package name */
    public int f17468j;

    /* renamed from: k, reason: collision with root package name */
    public File f17469k;

    /* renamed from: l, reason: collision with root package name */
    public int f17470l;

    /* renamed from: m, reason: collision with root package name */
    public int f17471m;

    /* renamed from: n, reason: collision with root package name */
    public int f17472n;

    /* renamed from: o, reason: collision with root package name */
    public IAudioPlayer f17473o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.fm.service.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0276a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17474a;

        static {
            int[] iArr = new int[IAudioPlayer.State.values().length];
            f17474a = iArr;
            try {
                iArr[IAudioPlayer.State.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17474a[IAudioPlayer.State.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17474a[IAudioPlayer.State.Preparing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17474a[IAudioPlayer.State.Playing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17474a[IAudioPlayer.State.Paused.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f17475a;

        /* renamed from: b, reason: collision with root package name */
        public FmLoader<FmList> f17476b;

        /* renamed from: c, reason: collision with root package name */
        public FmLoader<FmMidList> f17477c;

        /* renamed from: d, reason: collision with root package name */
        public int f17478d = -1;

        public a a() {
            a aVar = new a(this.f17475a);
            aVar.f17461c = this.f17476b;
            aVar.f17462d = this.f17477c;
            aVar.f17463e = this.f17478d;
            int i11 = this.f17478d;
            aVar.f17464f = i11 == -1 || i11 == -2;
            this.f17475a = null;
            return aVar;
        }

        public b b(FmLoader<FmList> loader) {
            this.f17476b = loader;
            return this;
        }

        public b c(FmLoader<FmMidList> loader) {
            this.f17477c = loader;
            return this;
        }

        public b d(int limit) {
            this.f17478d = limit;
            return this;
        }

        public b e(Context context) {
            this.f17475a = context;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements FmLoader.OnFmLoadListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f17479a;

        public c(a player) {
            this.f17479a = new WeakReference<>(player);
        }

        @Override // com.baicizhan.client.fm.data.load.FmLoader.OnFmLoadListener
        public void onIdle() {
            a aVar = this.f17479a.get();
            if (aVar == null) {
                return;
            }
            aVar.x();
        }

        @Override // com.baicizhan.client.fm.data.load.FmLoader.OnFmLoadListener
        public void onLoaded(boolean success, int code, String abspath, String url) {
            a aVar = this.f17479a.get();
            if (aVar == null) {
                return;
            }
            aVar.y(success, code, abspath, url);
        }
    }

    private boolean n() {
        if (this.f17473o == null) {
            return false;
        }
        int i11 = this.f17472n;
        return 2 == i11 || 3 == i11;
    }

    private boolean o() {
        return this.f17459a == null;
    }

    public void A() {
        if (o()) {
            return;
        }
        this.f17473o.play();
    }

    public void B() {
        if (o()) {
            return;
        }
        this.f17471m = 1001;
        FmLoader<FmList> fmLoader = this.f17461c;
        if (fmLoader == null) {
            qb.c.d(f17457p, "FM loader is null, cannot be played.", new Object[0]);
            this.f17472n = 8;
            w();
            return;
        }
        FmList targets = fmLoader.getTargets();
        if (targets == null) {
            this.f17472n = 7;
            w();
        } else {
            E(this.f17467i);
            int size = (this.f17467i + 1) % targets.size();
            this.f17467i = size;
            q(size);
        }
    }

    public void C() {
        if (o()) {
            return;
        }
        this.f17471m = 1001;
        FmLoader<FmList> fmLoader = this.f17461c;
        if (fmLoader == null) {
            qb.c.d(f17457p, "FM loader is null, cannot be played.", new Object[0]);
            this.f17472n = 8;
            w();
            return;
        }
        FmList targets = fmLoader.getTargets();
        if (targets == null) {
            this.f17472n = 7;
            this.f17471m = 1001;
            w();
        } else {
            E(this.f17467i);
            int size = ((this.f17467i - 1) + targets.size()) % targets.size();
            this.f17467i = size;
            q(size);
        }
    }

    public void D(int limit) {
        this.f17463e = limit;
        if (-1 == limit) {
            k();
            v();
        }
    }

    public final void E(int last) {
        FmList targets = this.f17461c.getTargets();
        if (!n() || targets == null || targets.isEmpty() || last < 0 || last >= targets.size()) {
            return;
        }
        targets.get(last).setSkipped(true);
    }

    public void F() {
        if (o()) {
            return;
        }
        this.f17473o.stop();
    }

    public void G() {
        if (o()) {
            return;
        }
        int i11 = this.f17472n;
        if (3 == i11) {
            A();
        } else if (2 == i11) {
            z();
        }
    }

    public final void g() {
        FmList targets = this.f17461c.getTargets();
        if (targets == null || targets.isEmpty()) {
            return;
        }
        targets.get(this.f17467i).accumViewed();
    }

    public final boolean h() {
        int b11 = d.b(pb.a.a());
        if (b11 != -1) {
            return ((b11 == 1 || b11 == 2 || b11 == 3) && -4 == this.f17463e) ? false : true;
        }
        return false;
    }

    public void i() {
        IAudioPlayer iAudioPlayer = this.f17473o;
        if (iAudioPlayer != null) {
            iAudioPlayer.stop();
            this.f17473o.destroy();
        }
        FmLoader<FmList> fmLoader = this.f17461c;
        if (fmLoader != null) {
            fmLoader.cancel();
        }
        FmLoader<FmMidList> fmLoader2 = this.f17462d;
        if (fmLoader2 != null) {
            fmLoader2.cancel();
        }
        this.f17459a = null;
    }

    public final boolean j(File file) {
        if (this.f17473o.c(file.getAbsolutePath())) {
            g();
            return true;
        }
        qb.c.b("whiz", "!!! fm play failed for damaged audio file: " + file, new Object[0]);
        qb.c.d(f17457p, "fm play failed for damaged audio file [%s], delete it and re dwonload", file.getAbsolutePath());
        file.delete();
        q(this.f17467i);
        return false;
    }

    public final void k() {
        FmLoader<FmList> fmLoader = this.f17461c;
        if (fmLoader != null) {
            fmLoader.extractOfflineFms();
        }
        FmLoader<FmMidList> fmLoader2 = this.f17462d;
        if (fmLoader2 != null) {
            fmLoader2.extractOfflineFms();
        }
    }

    public FmLoader<FmList> l() {
        return this.f17461c;
    }

    public FmLoader<FmMidList> m() {
        return this.f17462d;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
    public void onPlayError(int what, int extra) {
        File file = this.f17469k;
        if (file != null && file.exists()) {
            this.f17469k.delete();
        }
        qb.c.d(f17457p, "audip error %d, %d", Integer.valueOf(what), Integer.valueOf(extra));
        this.f17472n = 10;
        w();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
    public void onPlayStateChanged(IAudioPlayer.State state) {
        this.f17472n = 0;
        int i11 = C0276a.f17474a[state.ordinal()];
        if (i11 == 1) {
            this.f17472n = 11;
        } else if (i11 == 2) {
            this.f17472n = 0;
        } else if (i11 == 3) {
            this.f17472n = 1;
        } else if (i11 == 4) {
            this.f17472n = 2;
        } else if (i11 == 5) {
            this.f17472n = 3;
        }
        w();
    }

    public void p(boolean high) {
        if (o()) {
            return;
        }
        this.f17465g = high;
        FmLoader<FmList> fmLoader = this.f17461c;
        if (fmLoader != null) {
            fmLoader.setLoadHigh(high);
        }
        FmLoader<FmMidList> fmLoader2 = this.f17462d;
        if (fmLoader2 != null) {
            fmLoader2.setLoadHigh(high);
        }
    }

    @Override // kb.f
    public void p0(boolean canDuck) {
        if (canDuck) {
            return;
        }
        this.f17473o.pause();
    }

    public void q(int index) {
        if (o()) {
            return;
        }
        qb.c.b("whiz", "new play, start, fmloader: " + this.f17461c, new Object[0]);
        int i11 = this.f17467i;
        if (i11 != index) {
            E(i11);
            this.f17470l = 2;
        }
        this.f17467i = index;
        this.f17473o.stop();
        this.f17471m = 1001;
        FmLoader<FmList> fmLoader = this.f17461c;
        if (fmLoader == null) {
            qb.c.d("", "FM loader is null, cannot be played.", new Object[0]);
            this.f17472n = 8;
            w();
            return;
        }
        FmList targets = fmLoader.getTargets();
        if (targets == null || targets.isEmpty()) {
            qb.c.d("", "FM list is null or empty, cannot be played.", new Object[0]);
            this.f17472n = 7;
            w();
            return;
        }
        if (index >= targets.size() || index < 0) {
            qb.c.d("", "FM play index is out of range, expected index is [%d], but the factual range is [%d, %d]", Integer.valueOf(index), 0, Integer.valueOf(targets.size() - 1));
            return;
        }
        File file = new File(targets.getSavedPath(index, false));
        File file2 = new File(targets.getSavedPath(index, true));
        if (file2.exists() || !file.exists()) {
            file = file2;
        }
        this.f17469k = file;
        qb.c.b("whiz", "new play file: " + file + "; exists? " + file.exists() + "; offline? " + this.f17464f, new Object[0]);
        if (this.f17464f) {
            if (h()) {
                this.f17464f = false;
                this.f17461c.load(index, this.f17460b);
                if (!file.exists()) {
                    this.f17466h = true;
                    u();
                    return;
                }
            }
            if (file.exists()) {
                j(file);
                return;
            } else if (this.f17461c.hasOfflineFms()) {
                B();
                return;
            } else {
                this.f17472n = 5;
                w();
                return;
            }
        }
        if (!h()) {
            this.f17464f = true;
            this.f17461c.cancel();
            this.f17462d.cancel();
            q(index);
            return;
        }
        qb.c.b("whiz", "new play file: " + file + "; exists? " + file.exists(), new Object[0]);
        if (file.exists()) {
            this.f17466h = false;
            j(file);
        } else {
            this.f17462d.cancel();
            this.f17466h = true;
            u();
        }
        this.f17461c.load(index, this.f17460b);
    }

    public void r(String absPath) {
        if (o()) {
            return;
        }
        this.f17473o.stop();
        this.f17471m = 1000;
        if (absPath == null) {
            this.f17472n = 6;
            w();
        }
        File file = new File(absPath);
        this.f17469k = file;
        if (!file.exists()) {
            this.f17472n = 6;
            w();
        } else {
            if (this.f17473o.c(absPath)) {
                return;
            }
            file.delete();
            this.f17472n = 6;
            w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(int r8) {
        /*
            r7 = this;
            boolean r0 = r7.o()
            if (r0 == 0) goto L8
            goto Le1
        L8:
            com.baicizhan.client.framework.audio.IAudioPlayer r0 = r7.f17473o
            r0.stop()
            r0 = 1002(0x3ea, float:1.404E-42)
            r7.f17471m = r0
            com.baicizhan.client.fm.data.load.FmLoader<com.baicizhan.client.fm.data.FmMidList> r0 = r7.f17462d
            java.lang.String r1 = ""
            r2 = 0
            if (r0 != 0) goto L21
            java.lang.String r0 = "FM mid loader is null, cannot be played, just play next fm."
            java.lang.Object[] r3 = new java.lang.Object[r2]
            qb.c.d(r1, r0, r3)
            goto Ld0
        L21:
            com.baicizhan.client.fm.data.ITargetList r0 = r0.getTargets()
            com.baicizhan.client.fm.data.FmMidList r0 = (com.baicizhan.client.fm.data.FmMidList) r0
            r3 = 1
            if (r0 == 0) goto L58
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L31
            goto L58
        L31:
            if (r8 < 0) goto L3c
            int r4 = r0.size()
            if (r8 < r4) goto L3a
            goto L3c
        L3a:
            r1 = r3
            goto L60
        L3c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r6 = r0.size()
            int r6 = r6 - r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r5 = "FM mid play index is out of range, expected index is [%d], but the factual range is [%d, %d]"
            qb.c.d(r1, r5, r4)
        L56:
            r1 = r2
            goto L60
        L58:
            java.lang.String r4 = "FM mid list is null or empty, cannot be played, just play next fm."
            java.lang.Object[] r5 = new java.lang.Object[r2]
            qb.c.d(r1, r4, r5)
            goto L56
        L60:
            if (r1 == 0) goto Lcf
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r0.getSavedPath(r8, r2)
            r4.<init>(r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r0.getSavedPath(r8, r3)
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L81
            boolean r6 = r4.exists()
            if (r6 == 0) goto L81
            goto L82
        L81:
            r4 = r5
        L82:
            r7.f17469k = r4
            boolean r5 = r4.exists()
            if (r5 == 0) goto Lba
            com.baicizhan.client.framework.audio.IAudioPlayer r5 = r7.f17473o
            java.lang.String r6 = r4.getAbsolutePath()
            boolean r5 = r5.c(r6)
            if (r5 != 0) goto Laf
            r4.delete()
            com.baicizhan.client.fm.data.load.FmLoader<com.baicizhan.client.fm.data.FmMidList> r4 = r7.f17462d
            boolean r4 = r4.hasOfflineFms()
            if (r4 == 0) goto Ld0
            int r2 = r7.f17468j
            int r2 = r2 + r3
            int r0 = r0.size()
            int r2 = r2 % r0
            r7.f17468j = r2
            r7.s(r2)
            goto Lcf
        Laf:
            int r2 = r7.f17468j
            int r2 = r2 + r3
            int r0 = r0.size()
            int r2 = r2 % r0
            r7.f17468j = r2
            goto Lcf
        Lba:
            com.baicizhan.client.fm.data.load.FmLoader<com.baicizhan.client.fm.data.FmMidList> r4 = r7.f17462d
            boolean r4 = r4.hasOfflineFms()
            if (r4 == 0) goto Ld0
            int r2 = r7.f17468j
            int r2 = r2 + r3
            int r0 = r0.size()
            int r2 = r2 % r0
            r7.f17468j = r2
            r7.s(r2)
        Lcf:
            r2 = r1
        Ld0:
            if (r2 != 0) goto Le1
            r7.B()
            boolean r0 = r7.h()
            if (r0 == 0) goto Le1
            com.baicizhan.client.fm.data.load.FmLoader<com.baicizhan.client.fm.data.FmMidList> r0 = r7.f17462d
            r1 = 0
            r0.load(r8, r1)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.fm.service.a.s(int):void");
    }

    public void u() {
        if (o()) {
            return;
        }
        this.f17472n = 4;
        w();
    }

    public final void v() {
        Context context;
        ArrayList arrayList;
        if (o() || (context = this.f17459a) == null || !(context instanceof FmService)) {
            return;
        }
        FmLoader<FmList> fmLoader = this.f17461c;
        ArrayList arrayList2 = null;
        if (fmLoader == null || fmLoader.getTargets() == null) {
            arrayList = null;
        } else {
            FmList targets = this.f17461c.getTargets();
            int size = targets.size();
            arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(targets.get(i11).getWordid());
            }
        }
        FmLoader<FmMidList> fmLoader2 = this.f17462d;
        if (fmLoader2 != null && fmLoader2.getTargets() != null) {
            FmMidList targets2 = this.f17462d.getTargets();
            int size2 = targets2.size();
            ArrayList arrayList3 = new ArrayList(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(targets2.getSavedPath(i12, false));
            }
            arrayList2 = arrayList3;
        }
        ((FmService) this.f17459a).k0(this.f17463e, arrayList, arrayList2);
    }

    public void w() {
        Context context;
        if (o() || (context = this.f17459a) == null || !(context instanceof FmService)) {
            return;
        }
        FmService fmService = (FmService) context;
        int i11 = this.f17472n;
        int i12 = this.f17471m;
        fmService.l0(i11, 1002 == i12 ? this.f17468j : this.f17467i, i12);
    }

    public final void x() {
        FmMidList targets;
        FmLoader<FmMidList> fmLoader = this.f17462d;
        if (fmLoader == null || (targets = fmLoader.getTargets()) == null || targets.isEmpty()) {
            return;
        }
        qb.c.b("whiz", "fm mid start load...", new Object[0]);
        this.f17462d.load(null);
    }

    public final void y(boolean success, int code, String abspath, String url) {
        String str;
        if (o()) {
            return;
        }
        if (success) {
            if (this.f17466h) {
                this.f17466h = false;
                FmList targets = this.f17461c.getTargets();
                String savedPath = targets.getSavedPath(this.f17467i, false);
                String savedPath2 = targets.getSavedPath(this.f17467i, true);
                if (!TextUtils.equals(savedPath, abspath) && !TextUtils.equals(savedPath2, abspath)) {
                    qb.c.d(f17457p, "cannot play fm after loaded for downloaded file is not the one should be played. should [%s or %s], fact [%s]", savedPath, savedPath2, abspath);
                    this.f17466h = true;
                    return;
                }
                qb.c.b("whiz", "!!! loaded and new play index: " + this.f17467i, new Object[0]);
                if (4 == this.f17472n) {
                    q(this.f17467i);
                    return;
                }
                return;
            }
            return;
        }
        if (n()) {
            return;
        }
        qb.c.d(f17457p, "load fm failed for network reason. Url [%s], err code [%d]", url, Integer.valueOf(code));
        if (this.f17466h) {
            FmList targets2 = this.f17461c.getTargets();
            String path = targets2.getPath(this.f17467i, false);
            String path2 = targets2.getPath(this.f17467i, true);
            try {
                str = new URL(url).getPath();
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
                str = null;
            }
            if (TextUtils.equals(path, str) || TextUtils.equals(path2, str)) {
                int i11 = this.f17470l;
                if (i11 > 0) {
                    this.f17470l = i11 - 1;
                    q(this.f17467i);
                } else {
                    this.f17472n = 9;
                    w();
                }
            }
        }
    }

    public void z() {
        if (o()) {
            return;
        }
        this.f17473o.pause();
    }

    public a(Context context) {
        this.f17464f = true;
        this.f17465g = false;
        this.f17466h = false;
        this.f17467i = -1;
        this.f17470l = 2;
        this.f17459a = context;
        this.f17460b = new c(this);
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(context);
        this.f17473o = aVar;
        aVar.f(this);
        this.f17473o.j(this);
        this.f17473o.h(this);
    }

    @Override // kb.f
    public void t() {
    }
}
