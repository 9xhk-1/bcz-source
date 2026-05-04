package l50;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.DecodeSequenceMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJsonIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorKt\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,103:1\n226#2,10:104\n229#3:114\n*S KotlinDebug\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorKt\n*L\n39#1:104,10\n39#1:114\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70019a;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            try {
                iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70019a = iArr;
        }
    }

    @m80.k
    public static final <T> Iterator<T> a(@m80.k DecodeSequenceMode mode, @m80.k k50.a json, @m80.k f1 lexer, @m80.k f50.e<? extends T> deserializer) {
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(lexer, "lexer");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        int i11 = a.f70019a[b(lexer, mode).ordinal()];
        if (i11 == 1) {
            return new m0(json, lexer, deserializer);
        }
        if (i11 == 2) {
            return new k0(json, lexer, deserializer);
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    public static final DecodeSequenceMode b(l50.a aVar, DecodeSequenceMode decodeSequenceMode) {
        int i11 = a.f70019a[decodeSequenceMode.ordinal()];
        if (i11 == 1) {
            return DecodeSequenceMode.WHITESPACE_SEPARATED;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return c(aVar) ? DecodeSequenceMode.ARRAY_WRAPPED : DecodeSequenceMode.WHITESPACE_SEPARATED;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (c(aVar)) {
            return DecodeSequenceMode.ARRAY_WRAPPED;
        }
        String c11 = b.c((byte) 8);
        int i12 = aVar.f69912a;
        int i13 = i12 - 1;
        l50.a.B(aVar, "Expected " + c11 + ", but had '" + ((i12 == aVar.H().length() || i13 < 0) ? "EOF" : String.valueOf(aVar.H().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static final boolean c(l50.a aVar) {
        if (aVar.O() != 8) {
            return false;
        }
        aVar.m((byte) 8);
        return true;
    }
}
