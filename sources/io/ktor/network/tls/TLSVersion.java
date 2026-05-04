package io.ktor.network.tls;

import com.badlogic.gdx.graphics.f;
import java.util.List;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class TLSVersion {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TLSVersion[] $VALUES;

    @k
    public static final a Companion;
    public static final TLSVersion SSL3 = new TLSVersion("SSL3", 0, 768);
    public static final TLSVersion TLS10 = new TLSVersion("TLS10", 1, f.f11647q);
    public static final TLSVersion TLS11 = new TLSVersion("TLS11", 2, f.f11653r);
    public static final TLSVersion TLS12 = new TLSVersion("TLS12", 3, f.f11659s);

    @k
    private static final List<TLSVersion> byOrdinal;
    private final int code;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final TLSVersion a(int i11) {
            if (768 <= i11 && i11 < 772) {
                return (TLSVersion) TLSVersion.byOrdinal.get(i11 - 768);
            }
            throw new IllegalArgumentException("Invalid TLS version code " + i11);
        }

        public a() {
        }
    }

    private static final /* synthetic */ TLSVersion[] $values() {
        return new TLSVersion[]{SSL3, TLS10, TLS11, TLS12};
    }

    static {
        TLSVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
        byOrdinal = getEntries();
    }

    private TLSVersion(String str, int i11, int i12) {
        this.code = i12;
    }

    @k
    public static m00.a<TLSVersion> getEntries() {
        return $ENTRIES;
    }

    public static TLSVersion valueOf(String str) {
        return (TLSVersion) Enum.valueOf(TLSVersion.class, str);
    }

    public static TLSVersion[] values() {
        return (TLSVersion[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
