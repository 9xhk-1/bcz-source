package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends a {
    public f(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, @NonNull rt.b bVar, int i11, int i12, int i13) {
        if (bVar instanceof st.d) {
            st.d dVar = (st.d) bVar;
            float m11 = this.f100323b.m();
            int p11 = this.f100323b.p();
            int q11 = this.f100323b.q();
            int r11 = this.f100323b.r();
            int f11 = this.f100323b.f();
            if (this.f100323b.A()) {
                if (i11 == r11) {
                    m11 = dVar.e();
                    p11 = dVar.a();
                } else if (i11 == q11) {
                    m11 = dVar.f();
                    p11 = dVar.b();
                }
            } else if (i11 == q11) {
                m11 = dVar.e();
                p11 = dVar.a();
            } else if (i11 == f11) {
                m11 = dVar.f();
                p11 = dVar.b();
            }
            this.f100322a.setColor(p11);
            canvas.drawCircle(i12, i13, m11, this.f100322a);
        }
    }
}
