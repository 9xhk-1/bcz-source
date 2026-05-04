package com.baicizhan.client.business.util;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.apache.thrift.TBase;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nthrift_utils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n*L\n1#1,64:1\n43#1,4:65\n*S KotlinDebug\n*F\n+ 1 thrift_utils.kt\ncom/baicizhan/client/business/util/Thrift_utilsKt\n*L\n28#1:65,4\n*E\n"})
/* loaded from: classes4.dex */
public final class Thrift_utilsKt {
    /* renamed from: new, reason: not valid java name */
    public static final /* synthetic */ <T> T m5633new() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Constructor declaredConstructor = Object.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (T) declaredConstructor.newInstance(null);
    }

    public static final /* synthetic */ <T extends TBase<?, ?>> byte[] toBytes(T t11) {
        g0.p(t11, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            t11.write(new TBinaryProtocol(new TIOStreamTransport(byteArrayOutputStream)));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            qb.c.c(KotlinExtKt.TAG, "", e11);
            return null;
        }
    }

    public static final /* synthetic */ <T extends TBase<?, ?>> Object toThrift(byte[] bArr) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Constructor declaredConstructor = Object.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        TBase tBase = (TBase) declaredConstructor.newInstance(null);
        Result.a aVar = Result.Companion;
        Object m6308constructorimpl = Result.m6308constructorimpl(tBase);
        try {
            tBase.read(new TBinaryProtocol(new TIOStreamTransport(new ByteArrayInputStream(bArr))));
            return m6308constructorimpl;
        } catch (Exception e11) {
            Result.a aVar2 = Result.Companion;
            Object m6308constructorimpl2 = Result.m6308constructorimpl(kotlin.e.a(e11));
            qb.c.c(KotlinExtKt.TAG, "", e11);
            return m6308constructorimpl2;
        }
    }
}
