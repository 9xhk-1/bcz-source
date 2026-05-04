package os;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.malmstein.fenster.R;
import com.malmstein.fenster.view.FensterLoadingView;
import com.malmstein.fenster.view.FensterVideoView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends Fragment implements c {

    /* renamed from: a, reason: collision with root package name */
    public View f78420a;

    /* renamed from: b, reason: collision with root package name */
    public FensterVideoView f78421b;

    /* renamed from: c, reason: collision with root package name */
    public ls.a f78422c;

    /* renamed from: d, reason: collision with root package name */
    public FensterLoadingView f78423d;

    private void i() {
        this.f78423d.b();
        this.f78422c.hide();
    }

    @Override // os.c
    public void a() {
        h();
    }

    public final void b() {
        this.f78421b.setMediaController(this.f78422c);
        this.f78421b.setOnPlayStateListener(this);
    }

    @Override // os.c
    public void c() {
        i();
    }

    @Override // os.c
    public boolean d(int position) {
        return false;
    }

    @Override // os.c
    public void e() {
        this.f78422c.show();
    }

    public void f() {
        this.f78421b.b0("https://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4", 0);
        this.f78421b.start();
    }

    public void g(ls.b visibilityListener) {
        this.f78422c.setVisibilityListener(visibilityListener);
    }

    public void h() {
        this.f78423d.a();
        this.f78422c.show();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_fenster_video, container);
        this.f78420a = inflate;
        this.f78421b = (FensterVideoView) inflate.findViewById(R.id.play_video_texture);
        this.f78422c = (ls.a) this.f78420a.findViewById(R.id.play_video_controller);
        this.f78423d = (FensterLoadingView) this.f78420a.findViewById(R.id.play_video_loading);
        return this.f78420a;
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
    }
}
