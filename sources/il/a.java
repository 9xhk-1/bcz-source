package il;

import android.view.MotionEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f60694a;

    /* renamed from: b, reason: collision with root package name */
    public MotionEvent f60695b;

    public boolean a(MotionEvent ev2) {
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.f60695b = ev2;
            this.f60694a = 0;
            return false;
        }
        if (actionMasked != 2) {
            this.f60694a = 0;
            this.f60695b = null;
            return false;
        }
        int i11 = this.f60694a + 1;
        this.f60694a = i11;
        MotionEvent motionEvent = this.f60695b;
        return motionEvent != null && i11 <= 4 && Math.abs(motionEvent.getX() - ev2.getX()) <= 10.0f;
    }
}
