package u1;

import a3.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface c extends q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(c cVar);
    }

    void A(float f11);

    void U(a aVar);

    @Override // a3.q
    void dispose();

    float getPosition();

    float getVolume();

    boolean isLooping();

    boolean isPlaying();

    void pause();

    void play();

    void s0(float f11, float f12);

    void setLooping(boolean z11);

    void setVolume(float f11);

    void stop();
}
