package com.tencent.liteav.network;

import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements i {

    /* renamed from: f, reason: collision with root package name */
    private a f43755f;

    /* renamed from: a, reason: collision with root package name */
    private i f43750a = null;

    /* renamed from: b, reason: collision with root package name */
    private b f43751b = null;

    /* renamed from: c, reason: collision with root package name */
    private long f43752c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f43753d = 0;

    /* renamed from: e, reason: collision with root package name */
    private b f43754e = null;

    /* renamed from: g, reason: collision with root package name */
    private long f43756g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f43757h = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z11);
    }

    public d(a aVar) {
        this.f43755f = aVar;
    }

    public void b() {
        this.f43751b.a((i) null);
        this.f43754e.a(this);
        this.f43751b = this.f43754e;
        this.f43754e = null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[SwitchStream] end at ");
        sb2.append(this.f43752c);
        sb2.append(" stop ts ");
        sb2.append(this.f43757h);
        sb2.append(" start ts ");
        sb2.append(this.f43756g);
        sb2.append(" diff ts ");
        long j11 = this.f43757h;
        long j12 = this.f43756g;
        sb2.append(j11 > j12 ? j11 - j12 : j12 - j11);
        TXCLog.w("TXCMultiStreamDownloader", sb2.toString());
    }

    public long c() {
        b bVar = this.f43751b;
        if (bVar != null) {
            bVar.b(this.f43752c);
        }
        TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] stop original downloader, when video ts is" + this.f43752c);
        return this.f43752c;
    }

    @Override // com.tencent.liteav.network.i
    public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
        i iVar = this.f43750a;
        if (iVar != null) {
            iVar.onPullAudio(aVar);
        }
    }

    @Override // com.tencent.liteav.network.i
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        long j11 = tXSNALPacket.pts;
        this.f43752c = j11;
        if (tXSNALPacket.nalType == 0) {
            this.f43753d = j11;
        }
        i iVar = this.f43750a;
        if (iVar != null) {
            iVar.onPullNAL(tXSNALPacket);
        }
    }

    public void a(i iVar) {
        this.f43750a = iVar;
    }

    public void a() {
        b bVar = this.f43751b;
        if (bVar != null) {
            bVar.b(0L);
        }
        b bVar2 = this.f43754e;
        if (bVar2 != null) {
            bVar2.b(0L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements com.tencent.liteav.basic.b.b, i {

        /* renamed from: a, reason: collision with root package name */
        private final int f43758a = 2;

        /* renamed from: b, reason: collision with root package name */
        private long f43759b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f43760c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f43761d = 0;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43762e = false;

        /* renamed from: f, reason: collision with root package name */
        private long f43763f = 0;

        /* renamed from: g, reason: collision with root package name */
        private long f43764g = 0;

        /* renamed from: h, reason: collision with root package name */
        private long f43765h = 0;

        /* renamed from: i, reason: collision with root package name */
        private ArrayList<TXSNALPacket> f43766i = new ArrayList<>();

        /* renamed from: j, reason: collision with root package name */
        private ArrayList<com.tencent.liteav.basic.structs.a> f43767j = new ArrayList<>();

        /* renamed from: k, reason: collision with root package name */
        private TXIStreamDownloader f43768k;

        /* renamed from: l, reason: collision with root package name */
        private WeakReference<d> f43769l;

        /* renamed from: m, reason: collision with root package name */
        private i f43770m;

        public b(TXIStreamDownloader tXIStreamDownloader, d dVar) {
            this.f43768k = null;
            this.f43769l = new WeakReference<>(dVar);
            this.f43768k = tXIStreamDownloader;
            tXIStreamDownloader.setListener(this);
        }

        public void a(long j11) {
            TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] start switch. current video pts:" + j11);
            this.f43761d = 0;
            this.f43759b = j11;
            this.f43768k.setListener(this);
            this.f43768k.setNotifyListener(this);
        }

        public void b(long j11) {
            TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] stop switch. pts:" + j11);
            this.f43759b = 0L;
            this.f43763f = j11;
            this.f43765h = 0L;
            this.f43764g = 0L;
            TXIStreamDownloader tXIStreamDownloader = this.f43768k;
            if (tXIStreamDownloader == null || j11 != 0) {
                return;
            }
            tXIStreamDownloader.stopDownload();
            this.f43768k = null;
        }

        @Override // com.tencent.liteav.basic.b.b
        public void onNotifyEvent(int i11, Bundle bundle) {
            if (i11 == -2301 || i11 == 3010) {
                d dVar = this.f43769l.get();
                if (dVar != null) {
                    dVar.a(this.f43768k, false);
                }
                this.f43768k.setNotifyListener(null);
            }
        }

        @Override // com.tencent.liteav.network.i
        public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
            if (this.f43759b > 0) {
                a(aVar);
                return;
            }
            if (this.f43763f > 0) {
                b(aVar);
                return;
            }
            i iVar = this.f43770m;
            if (iVar != null) {
                iVar.onPullAudio(aVar);
            }
        }

        @Override // com.tencent.liteav.network.i
        public void onPullNAL(TXSNALPacket tXSNALPacket) {
            if (tXSNALPacket == null) {
                return;
            }
            if (this.f43759b > 0) {
                a(tXSNALPacket);
                return;
            }
            if (this.f43763f > 0) {
                b(tXSNALPacket);
                return;
            }
            i iVar = this.f43770m;
            if (iVar != null) {
                iVar.onPullNAL(tXSNALPacket);
            }
        }

        public void a(i iVar) {
            this.f43770m = iVar;
        }

        private void a(com.tencent.liteav.basic.structs.a aVar) {
            if (aVar == null) {
                return;
            }
            long j11 = aVar.f43400e;
            long j12 = this.f43760c;
            if (j11 < j12 || j11 < this.f43759b) {
                return;
            }
            i iVar = this.f43770m;
            if (iVar != null && j12 > 0 && j11 >= j12) {
                iVar.onPullAudio(aVar);
            } else {
                this.f43767j.add(aVar);
            }
        }

        private void b(com.tencent.liteav.basic.structs.a aVar) {
            if (this.f43765h > 0) {
                return;
            }
            long j11 = this.f43764g;
            if (j11 > 0 && aVar != null) {
                long j12 = aVar.f43400e;
                if (j12 >= j11) {
                    this.f43765h = j12;
                    return;
                }
            }
            i iVar = this.f43770m;
            if (iVar != null) {
                iVar.onPullAudio(aVar);
            }
        }

        private void a(TXSNALPacket tXSNALPacket) {
            d dVar = this.f43769l.get();
            if (tXSNALPacket.nalType == 0 && !this.f43762e) {
                this.f43761d++;
                TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] processing... current video ts:" + tXSNALPacket.pts + " target video ts:" + tXSNALPacket.pts + " check times:" + this.f43761d + " maxTimes:2");
                if (dVar != null && (dVar.f43753d <= tXSNALPacket.pts || this.f43761d == 2)) {
                    if (dVar.f43753d <= tXSNALPacket.pts) {
                        TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] switch video success, video data is ready.");
                    } else if (this.f43761d == 2) {
                        TXCLog.e("TXCMultiStreamDownloader", "[SwitchStream] switch video failed. all times retried. max times:2");
                    }
                    this.f43759b = dVar.c();
                    this.f43762e = true;
                }
            }
            if (this.f43762e) {
                if (dVar != null) {
                    dVar.a(tXSNALPacket.pts);
                }
                long j11 = tXSNALPacket.pts;
                if (j11 >= this.f43759b) {
                    if (tXSNALPacket.nalType == 0 && this.f43760c == 0) {
                        this.f43760c = j11;
                        TXCLog.w("TXCMultiStreamDownloader", "[SwitchStream] pre start end " + tXSNALPacket.pts + " from " + this.f43759b + " type " + tXSNALPacket.nalType);
                    }
                    if (this.f43760c > 0) {
                        if (this.f43770m != null) {
                            if (dVar != null) {
                                dVar.a(this.f43768k, true);
                            }
                            if (!this.f43767j.isEmpty()) {
                                Iterator<com.tencent.liteav.basic.structs.a> it = this.f43767j.iterator();
                                while (it.hasNext()) {
                                    com.tencent.liteav.basic.structs.a next = it.next();
                                    if (next.f43400e >= this.f43760c) {
                                        TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] pre start cache audio pts " + next.f43400e + " from " + this.f43760c);
                                        this.f43770m.onPullAudio(next);
                                    }
                                }
                                TXCLog.w("TXCMultiStreamDownloader", "[SwitchStream] pre start end audio cache  " + this.f43767j.size());
                                this.f43767j.clear();
                            }
                            if (!this.f43766i.isEmpty()) {
                                TXCLog.w("TXCMultiStreamDownloader", "[SwitchStream] pre start end video cache  " + this.f43766i.size());
                                Iterator<TXSNALPacket> it2 = this.f43766i.iterator();
                                while (it2.hasNext()) {
                                    this.f43770m.onPullNAL(it2.next());
                                }
                                this.f43766i.clear();
                            }
                            TXCLog.w("TXCMultiStreamDownloader", "[SwitchStream] pre start first pull nal " + tXSNALPacket.pts + " from " + this.f43760c + " type " + tXSNALPacket.nalType);
                            this.f43770m.onPullNAL(tXSNALPacket);
                            this.f43770m = null;
                            return;
                        }
                        TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] pre start cache video pts " + tXSNALPacket.pts + " from " + this.f43760c + " type " + tXSNALPacket.nalType);
                        this.f43766i.add(tXSNALPacket);
                    }
                }
            }
        }

        private void b(TXSNALPacket tXSNALPacket) {
            d dVar = this.f43769l.get();
            if (dVar != null) {
                dVar.b(tXSNALPacket.pts);
            }
            long j11 = tXSNALPacket.pts;
            if (j11 >= this.f43763f) {
                if (tXSNALPacket.nalType == 0) {
                    this.f43764g = j11;
                }
                if (this.f43764g <= 0) {
                    i iVar = this.f43770m;
                    if (iVar != null) {
                        iVar.onPullNAL(tXSNALPacket);
                        return;
                    }
                    return;
                }
                if (this.f43765h > 0) {
                    TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] switch finish and stop old downloader. video ts:" + this.f43764g + " audio ts:" + this.f43765h + " stop ts:" + this.f43763f);
                    if (dVar != null) {
                        dVar.b();
                    }
                    this.f43770m = null;
                    this.f43768k.setListener(null);
                    this.f43768k.stopDownload();
                    return;
                }
                TXCLog.w("TXCMultiStreamDownloader", "[SwitchStream] delay stop video end wait audio end video pts " + tXSNALPacket.pts + " from " + this.f43763f + " type " + tXSNALPacket.nalType);
                return;
            }
            i iVar2 = this.f43770m;
            if (iVar2 != null) {
                iVar2.onPullNAL(tXSNALPacket);
            }
        }
    }

    public void b(long j11) {
        this.f43757h = j11;
    }

    public void a(TXIStreamDownloader tXIStreamDownloader, TXIStreamDownloader tXIStreamDownloader2, long j11, long j12, String str) {
        TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] old downloader:" + tXIStreamDownloader.hashCode() + " new downloader:" + tXIStreamDownloader2.hashCode());
        this.f43752c = tXIStreamDownloader.getCurrentTS();
        this.f43753d = tXIStreamDownloader.getLastIFrameTS();
        b bVar = new b(tXIStreamDownloader, this);
        this.f43751b = bVar;
        bVar.a(this);
        ((TXCFLVDownloader) tXIStreamDownloader).recvData(true);
        Vector<e> vector = new Vector<>();
        vector.add(new e(str, false));
        tXIStreamDownloader2.setOriginUrl(str);
        ((TXCFLVDownloader) tXIStreamDownloader2).recvData(true);
        tXIStreamDownloader2.startDownload(vector, false, false, tXIStreamDownloader.mEnableMessage, tXIStreamDownloader.mEnableMetaData);
        b bVar2 = new b(tXIStreamDownloader2, this);
        this.f43754e = bVar2;
        bVar2.a(this.f43752c);
    }

    public void a(TXIStreamDownloader tXIStreamDownloader, boolean z11) {
        TXCLog.i("TXCMultiStreamDownloader", "[SwitchStream] switch stream finish. result:" + z11);
        a aVar = this.f43755f;
        if (aVar != null) {
            aVar.onSwitchFinish(tXIStreamDownloader, z11);
        }
    }

    public void a(long j11) {
        this.f43756g = j11;
    }
}
