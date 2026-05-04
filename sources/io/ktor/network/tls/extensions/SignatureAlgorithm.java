package io.ktor.network.tls.extensions;

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
public final class SignatureAlgorithm {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SignatureAlgorithm[] $VALUES;

    @k
    public static final a Companion;
    private final byte code;
    public static final SignatureAlgorithm ANON = new SignatureAlgorithm("ANON", 0, (byte) 0);
    public static final SignatureAlgorithm RSA = new SignatureAlgorithm("RSA", 1, (byte) 1);
    public static final SignatureAlgorithm DSA = new SignatureAlgorithm("DSA", 2, (byte) 2);
    public static final SignatureAlgorithm ECDSA = new SignatureAlgorithm("ECDSA", 3, (byte) 3);
    public static final SignatureAlgorithm ED25519 = new SignatureAlgorithm("ED25519", 4, (byte) 7);
    public static final SignatureAlgorithm ED448 = new SignatureAlgorithm("ED448", 5, (byte) 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSignatureAlgorithm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureAlgorithm.kt\nio/ktor/network/tls/extensions/SignatureAlgorithm$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final SignatureAlgorithm a(byte b11) {
            Object obj;
            Iterator<E> it = SignatureAlgorithm.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((SignatureAlgorithm) obj).getCode() == b11) {
                    break;
                }
            }
            return (SignatureAlgorithm) obj;
        }

        public a() {
        }
    }

    private static final /* synthetic */ SignatureAlgorithm[] $values() {
        return new SignatureAlgorithm[]{ANON, RSA, DSA, ECDSA, ED25519, ED448};
    }

    static {
        SignatureAlgorithm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private SignatureAlgorithm(String str, int i11, byte b11) {
        this.code = b11;
    }

    @k
    public static m00.a<SignatureAlgorithm> getEntries() {
        return $ENTRIES;
    }

    public static SignatureAlgorithm valueOf(String str) {
        return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
    }

    public static SignatureAlgorithm[] values() {
        return (SignatureAlgorithm[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }
}
