package q9;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class l implements IAudioPlayer {

    /* renamed from: e, reason: collision with root package name */
    public static final int f81957e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.baicizhan.client.framework.audio.a f81958a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public IAudioPlayer.a f81959b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public IAudioPlayer.b f81960c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public kb.f f81961d;

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean a(int i11) {
        return this.f81958a.a(i11);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void b(float f11) {
        this.f81958a.b(f11);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean c(String str) {
        return this.f81958a.c(str);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean d(FileDescriptor fileDescriptor, long j11, long j12) {
        return this.f81958a.d(fileDescriptor, j11, j12);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void destroy() {
        f fVar = f.f81930a;
        fVar.i().stop();
        IAudioPlayer.a aVar = this.f81959b;
        if (aVar != null) {
            fVar.n(aVar);
        }
        IAudioPlayer.b bVar = this.f81960c;
        if (bVar != null) {
            fVar.p(bVar);
        }
        kb.f fVar2 = this.f81961d;
        if (fVar2 != null) {
            fVar.o(fVar2);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean e(File file) {
        return this.f81958a.e(file);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void f(@m80.l IAudioPlayer.b bVar) {
        IAudioPlayer.b bVar2 = this.f81960c;
        if (bVar2 != null) {
            f.f81930a.p(bVar2);
        }
        this.f81960c = bVar;
        if (bVar != null) {
            f.f81930a.m(bVar);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean g(String str) {
        return this.f81958a.g(str);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public int getDuration() {
        return this.f81958a.getDuration();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public long getPosition() {
        return this.f81958a.getPosition();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void h(@m80.l kb.f fVar) {
        kb.f fVar2 = this.f81961d;
        if (fVar2 != null) {
            f.f81930a.o(fVar2);
        }
        this.f81961d = fVar;
        if (fVar != null) {
            f.f81930a.l(fVar);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean i(String str, boolean z11) {
        return this.f81958a.i(str, z11);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void j(@m80.l IAudioPlayer.a aVar) {
        IAudioPlayer.a aVar2 = this.f81959b;
        if (aVar2 != null) {
            f.f81930a.n(aVar2);
        }
        this.f81959b = aVar;
        if (aVar != null) {
            f.f81930a.k(aVar);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void pause() {
        this.f81958a.pause();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void play() {
        this.f81958a.play();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void seekTo(int i11) {
        this.f81958a.seekTo(i11);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void setVolume(float f11, float f12) {
        this.f81958a.setVolume(f11, f12);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void stop() {
        f.f81930a.i().pause();
    }

    @w00.k
    public l(@m80.l Context context) {
        this.f81958a = f.f81930a.i();
    }

    public /* synthetic */ l(Context context, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : context);
    }
}
