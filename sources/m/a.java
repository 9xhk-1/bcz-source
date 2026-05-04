package m;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import kotlin.jvm.internal.g0;
import l.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements l.d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Cursor f71723a;

    public a(@m80.k Cursor cursor, @m80.l Long l11) {
        g0.p(cursor, "cursor");
        this.f71723a = cursor;
        if (Build.VERSION.SDK_INT < 28 || l11 == null || !(cursor instanceof AbstractWindowedCursor)) {
            return;
        }
        r.a((AbstractWindowedCursor) cursor, l11.longValue());
    }

    @m80.k
    public Object a() {
        return c.d.c(Boolean.valueOf(this.f71723a.moveToNext()));
    }

    @Override // l.d
    @m80.l
    public Boolean getBoolean(int i11) {
        if (this.f71723a.isNull(i11)) {
            return null;
        }
        return Boolean.valueOf(this.f71723a.getLong(i11) == 1);
    }

    @Override // l.d
    @m80.l
    public byte[] getBytes(int i11) {
        if (this.f71723a.isNull(i11)) {
            return null;
        }
        return this.f71723a.getBlob(i11);
    }

    @Override // l.d
    @m80.l
    public Double getDouble(int i11) {
        if (this.f71723a.isNull(i11)) {
            return null;
        }
        return Double.valueOf(this.f71723a.getDouble(i11));
    }

    @Override // l.d
    @m80.l
    public Long getLong(int i11) {
        if (this.f71723a.isNull(i11)) {
            return null;
        }
        return Long.valueOf(this.f71723a.getLong(i11));
    }

    @Override // l.d
    @m80.l
    public String getString(int i11) {
        if (this.f71723a.isNull(i11)) {
            return null;
        }
        return this.f71723a.getString(i11);
    }

    @Override // l.d
    public /* bridge */ /* synthetic */ l.c next() {
        return c.d.b(a());
    }
}
