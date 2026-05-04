package io.ktor.network.tls.extensions;

import com.jiongji.andriod.card.R;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class NamedCurve {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ NamedCurve[] $VALUES;

    @k
    public static final a Companion;
    private final short code;
    private final int fieldSize;
    public static final NamedCurve sect163k1 = new NamedCurve("sect163k1", 0, 1, 163);
    public static final NamedCurve sect163r1 = new NamedCurve("sect163r1", 1, 2, 163);
    public static final NamedCurve sect163r2 = new NamedCurve("sect163r2", 2, 3, 163);
    public static final NamedCurve sect193r1 = new NamedCurve("sect193r1", 3, 4, 193);
    public static final NamedCurve sect193r2 = new NamedCurve("sect193r2", 4, 5, 193);
    public static final NamedCurve sect233k1 = new NamedCurve("sect233k1", 5, 6, R.styleable.Theme_drawable_tab_lecture);
    public static final NamedCurve sect233r1 = new NamedCurve("sect233r1", 6, 7, R.styleable.Theme_drawable_tab_lecture);
    public static final NamedCurve sect239k1 = new NamedCurve("sect239k1", 7, 8, R.styleable.Theme_drawable_tab_surrounding);
    public static final NamedCurve sect283k1 = new NamedCurve("sect283k1", 8, 9, 283);
    public static final NamedCurve sect283r1 = new NamedCurve("sect283r1", 9, 10, 283);
    public static final NamedCurve sect409k1 = new NamedCurve("sect409k1", 10, 11, 409);
    public static final NamedCurve sect409r1 = new NamedCurve("sect409r1", 11, 12, 409);
    public static final NamedCurve sect571k1 = new NamedCurve("sect571k1", 12, 13, 571);
    public static final NamedCurve sect571r1 = new NamedCurve("sect571r1", 13, 14, 571);
    public static final NamedCurve secp160k1 = new NamedCurve("secp160k1", 14, 15, 160);
    public static final NamedCurve secp160r1 = new NamedCurve("secp160r1", 15, 16, 160);
    public static final NamedCurve secp160r2 = new NamedCurve("secp160r2", 16, 17, 160);
    public static final NamedCurve secp192k1 = new NamedCurve("secp192k1", 17, 18, 192);
    public static final NamedCurve secp192r1 = new NamedCurve("secp192r1", 18, 19, 192);
    public static final NamedCurve secp224k1 = new NamedCurve("secp224k1", 19, 20, 224);
    public static final NamedCurve secp224r1 = new NamedCurve("secp224r1", 20, 21, 224);
    public static final NamedCurve secp256k1 = new NamedCurve("secp256k1", 21, 22, 256);
    public static final NamedCurve secp256r1 = new NamedCurve("secp256r1", 22, 23, 256);
    public static final NamedCurve secp384r1 = new NamedCurve("secp384r1", 23, 24, 384);
    public static final NamedCurve secp521r1 = new NamedCurve("secp521r1", 24, 25, 521);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNamedCurves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NamedCurves.kt\nio/ktor/network/tls/extensions/NamedCurve$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final NamedCurve a(short s11) {
            Object obj;
            Iterator<E> it = NamedCurve.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((NamedCurve) obj).getCode() == s11) {
                    break;
                }
            }
            return (NamedCurve) obj;
        }

        public a() {
        }
    }

    private static final /* synthetic */ NamedCurve[] $values() {
        return new NamedCurve[]{sect163k1, sect163r1, sect163r2, sect193r1, sect193r2, sect233k1, sect233r1, sect239k1, sect283k1, sect283r1, sect409k1, sect409r1, sect571k1, sect571r1, secp160k1, secp160r1, secp160r2, secp192k1, secp192r1, secp224k1, secp224r1, secp256k1, secp256r1, secp384r1, secp521r1};
    }

    static {
        NamedCurve[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private NamedCurve(String str, int i11, short s11, int i12) {
        this.code = s11;
        this.fieldSize = i12;
    }

    @k
    public static m00.a<NamedCurve> getEntries() {
        return $ENTRIES;
    }

    public static NamedCurve valueOf(String str) {
        return (NamedCurve) Enum.valueOf(NamedCurve.class, str);
    }

    public static NamedCurve[] values() {
        return (NamedCurve[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }

    public final int getFieldSize() {
        return this.fieldSize;
    }
}
