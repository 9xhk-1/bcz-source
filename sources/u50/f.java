package u50;

import a00.a0;
import a00.d1;
import a00.h0;
import a00.i0;
import a00.l1;
import a00.r0;
import androidx.collection.SieveCacheKt;
import g10.u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.x0;
import kotlin.text.Regex;
import l60.e1;
import l60.g1;
import l60.v0;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.i;
import okhttp3.m;
import okhttp3.n;
import okhttp3.o;
import okio.ByteString;
import t50.m;
import t50.q;
import u30.f0;
import u30.k0;
import w00.g;
import w00.j;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Util")
@u0({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public static final byte[] f91846a;

    /* renamed from: b, reason: collision with root package name */
    @g
    @k
    public static final h f91847b = h.f77281b.j(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @g
    @k
    public static final o f91848c;

    /* renamed from: d, reason: collision with root package name */
    @g
    @k
    public static final m f91849d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final v0 f91850e;

    /* renamed from: f, reason: collision with root package name */
    @g
    @k
    public static final TimeZone f91851f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final Regex f91852g;

    /* renamed from: h, reason: collision with root package name */
    @g
    public static final boolean f91853h;

    /* renamed from: i, reason: collision with root package name */
    @g
    @k
    public static final String f91854i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f91855j = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        f91846a = bArr;
        f91848c = o.b.l(o.f77523b, bArr, null, 1, null);
        f91849d = m.a.r(m.f77487a, bArr, null, 0, 0, 7, null);
        v0.a aVar = v0.f70499c;
        ByteString.a aVar2 = ByteString.Companion;
        f91850e = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        g0.m(timeZone);
        f91851f = timeZone;
        f91852g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f91853h = false;
        String name = q.class.getName();
        g0.o(name, "OkHttpClient::class.java.name");
        f91854i = k0.D4(k0.x4(name, "okhttp3."), "Client");
    }

    public static final long A(@k n nVar) {
        g0.p(nVar, "<this>");
        String d11 = nVar.k0().d("Content-Length");
        if (d11 != null) {
            return j0(d11, -1L);
        }
        return -1L;
    }

    public static final void B(@k x00.a<g2> block) {
        g0.p(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @k
    public static final <T> List<T> C(@k T... elements) {
        g0.p(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(h0.Q(Arrays.copyOf(objArr, objArr.length)));
        g0.o(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int D(@k String[] strArr, @k String value, @k Comparator<String> comparator) {
        g0.p(strArr, "<this>");
        g0.p(value, "value");
        g0.p(comparator, "comparator");
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (comparator.compare(strArr[i11], value) == 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int E(@k String str) {
        g0.p(str, "<this>");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (g0.t(charAt, 31) <= 0 || g0.t(charAt, 127) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int F(@k String str, int i11, int i12) {
        g0.p(str, "<this>");
        while (i11 < i12) {
            char charAt = str.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int G(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return F(str, i11, i12);
    }

    public static final int H(@k String str, int i11, int i12) {
        g0.p(str, "<this>");
        int i13 = i12 - 1;
        if (i11 <= i13) {
            while (true) {
                char charAt = str.charAt(i13);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13--;
            }
        }
        return i11;
    }

    public static /* synthetic */ int I(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return H(str, i11, i12);
    }

    public static final int J(@k String str, int i11) {
        g0.p(str, "<this>");
        int length = str.length();
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt != ' ' && charAt != '\t') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    public static /* synthetic */ int K(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return J(str, i11);
    }

    @k
    public static final String[] L(@k String[] strArr, @k String[] other, @k Comparator<? super String> comparator) {
        g0.p(strArr, "<this>");
        g0.p(other, "other");
        g0.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i11]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i11++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean M(@k d60.a aVar, @k File file) {
        g0.p(aVar, "<this>");
        g0.p(file, "file");
        e1 h11 = aVar.h(file);
        try {
            try {
                aVar.c(file);
                r00.b.a(h11, null);
                return true;
            } catch (IOException unused) {
                g2 g2Var = g2.f100423a;
                r00.b.a(h11, null);
                aVar.c(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean N(@k Socket socket, @k l60.m source) {
        g0.p(socket, "<this>");
        g0.p(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.J();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean O(@k String name) {
        g0.p(name, "name");
        return f0.c2(name, "Authorization", true) || f0.c2(name, "Cookie", true) || f0.c2(name, "Proxy-Authorization", true) || f0.c2(name, "Set-Cookie", true);
    }

    public static final void P(@k Object obj) {
        g0.p(obj, "<this>");
        obj.notify();
    }

    public static final void Q(@k Object obj) {
        g0.p(obj, "<this>");
        obj.notifyAll();
    }

    public static final int R(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('a' <= c11 && c11 < 'g') {
            return c11 - 'W';
        }
        if ('A' > c11 || c11 >= 'G') {
            return -1;
        }
        return c11 - '7';
    }

    @k
    public static final String S(@k Socket socket) {
        g0.p(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        g0.o(hostName, "address.hostName");
        return hostName;
    }

    @k
    public static final Charset T(@k l60.m mVar, @k Charset charset) throws IOException {
        g0.p(mVar, "<this>");
        g0.p(charset, "default");
        int X2 = mVar.X2(f91850e);
        if (X2 == -1) {
            return charset;
        }
        if (X2 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            g0.o(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (X2 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            g0.o(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (X2 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            g0.o(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (X2 == 3) {
            return u30.d.f91598a.b();
        }
        if (X2 == 4) {
            return u30.d.f91598a.c();
        }
        throw new AssertionError();
    }

    @l
    public static final <T> T U(@k Object instance, @k Class<T> fieldType, @k String fieldName) {
        T t11;
        Object U;
        g0.p(instance, "instance");
        g0.p(fieldType, "fieldType");
        g0.p(fieldName, "fieldName");
        Class<?> cls = instance.getClass();
        while (true) {
            t11 = null;
            if (g0.g(cls, Object.class)) {
                if (g0.g(fieldName, "delegate") || (U = U(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) U(U, fieldType, fieldName);
            }
            try {
                Field declaredField = cls.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                t11 = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                g0.o(cls, "c.superclass");
            }
        }
        return t11;
    }

    public static final int V(@k l60.m mVar) throws IOException {
        g0.p(mVar, "<this>");
        return d(mVar.readByte(), 255) | (d(mVar.readByte(), 255) << 16) | (d(mVar.readByte(), 255) << 8);
    }

    public static final int W(@k l60.k kVar, byte b11) {
        g0.p(kVar, "<this>");
        int i11 = 0;
        while (!kVar.J() && kVar.x0(0L) == b11) {
            i11++;
            kVar.readByte();
        }
        return i11;
    }

    public static final boolean X(@k g1 g1Var, int i11, @k TimeUnit timeUnit) throws IOException {
        g0.p(g1Var, "<this>");
        g0.p(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long f11 = g1Var.D().h() ? g1Var.D().f() - nanoTime : Long.MAX_VALUE;
        g1Var.D().g(Math.min(f11, timeUnit.toNanos(i11)) + nanoTime);
        try {
            l60.k kVar = new l60.k();
            while (g1Var.L3(kVar, 8192L) != -1) {
                kVar.e();
            }
            if (f11 == Long.MAX_VALUE) {
                g1Var.D().c();
                return true;
            }
            g1Var.D().g(nanoTime + f11);
            return true;
        } catch (InterruptedIOException unused) {
            if (f11 == Long.MAX_VALUE) {
                g1Var.D().c();
                return false;
            }
            g1Var.D().g(nanoTime + f11);
            return false;
        } catch (Throwable th2) {
            if (f11 == Long.MAX_VALUE) {
                g1Var.D().c();
            } else {
                g1Var.D().g(nanoTime + f11);
            }
            throw th2;
        }
    }

    @k
    public static final ThreadFactory Y(@k final String name, final boolean z11) {
        g0.p(name, "name");
        return new ThreadFactory() { // from class: u50.e
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread Z;
                Z = f.Z(name, z11, runnable);
                return Z;
            }
        };
    }

    public static final Thread Z(String name, boolean z11, Runnable runnable) {
        g0.p(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z11);
        return thread;
    }

    public static final void a0(@k String name, @k x00.a<g2> block) {
        g0.p(name, "name");
        g0.p(block, "block");
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            d0.d(1);
            currentThread.setName(name2);
            d0.c(1);
        }
    }

    @k
    public static final List<c60.a> b0(@k h hVar) {
        g0.p(hVar, "<this>");
        g10.l W1 = u.W1(0, hVar.size());
        ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            arrayList.add(new c60.a(hVar.h(nextInt), hVar.o(nextInt)));
        }
        return arrayList;
    }

    public static final <E> void c(@k List<E> list, E e11) {
        g0.p(list, "<this>");
        if (list.contains(e11)) {
            return;
        }
        list.add(e11);
    }

    @k
    public static final h c0(@k List<c60.a> list) {
        g0.p(list, "<this>");
        h.a aVar = new h.a();
        for (c60.a aVar2 : list) {
            aVar.g(aVar2.a().utf8(), aVar2.b().utf8());
        }
        return aVar.i();
    }

    public static final int d(byte b11, int i11) {
        return b11 & i11;
    }

    @k
    public static final String d0(int i11) {
        String hexString = Integer.toHexString(i11);
        g0.o(hexString, "toHexString(this)");
        return hexString;
    }

    public static final int e(short s11, int i11) {
        return s11 & i11;
    }

    @k
    public static final String e0(long j11) {
        String hexString = Long.toHexString(j11);
        g0.o(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long f(int i11, long j11) {
        return i11 & j11;
    }

    @k
    public static final String f0(@k i iVar, boolean z11) {
        String F;
        g0.p(iVar, "<this>");
        if (k0.n3(iVar.F(), ":", false, 2, null)) {
            F = '[' + iVar.F() + l50.b.f69930l;
        } else {
            F = iVar.F();
        }
        if (!z11 && iVar.N() == i.f77284k.g(iVar.X())) {
            return F;
        }
        return F + ':' + iVar.N();
    }

    @k
    public static final m.c g(@k final t50.m mVar) {
        g0.p(mVar, "<this>");
        return new m.c() { // from class: u50.d
            @Override // t50.m.c
            public final t50.m a(t50.b bVar) {
                t50.m h11;
                h11 = f.h(t50.m.this, bVar);
                return h11;
            }
        };
    }

    public static /* synthetic */ String g0(i iVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return f0(iVar, z11);
    }

    public static final t50.m h(t50.m this_asFactory, t50.b it) {
        g0.p(this_asFactory, "$this_asFactory");
        g0.p(it, "it");
        return this_asFactory;
    }

    @k
    public static final <T> List<T> h0(@k List<? extends T> list) {
        g0.p(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(r0.d6(list));
        g0.o(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final void i(@k Object obj) {
        g0.p(obj, "<this>");
        if (f91853h && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    @k
    public static final <K, V> Map<K, V> i0(@k Map<K, ? extends V> map) {
        g0.p(map, "<this>");
        if (map.isEmpty()) {
            return l1.z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        g0.o(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final void j(@k Object obj) {
        g0.p(obj, "<this>");
        if (!f91853h || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final long j0(@k String str, long j11) {
        g0.p(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j11;
        }
    }

    public static final boolean k(@k String str) {
        g0.p(str, "<this>");
        return f91852g.matches(str);
    }

    public static final int k0(@l String str, int i11) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i11;
    }

    public static final boolean l(@k i iVar, @k i other) {
        g0.p(iVar, "<this>");
        g0.p(other, "other");
        return g0.g(iVar.F(), other.F()) && iVar.N() == other.N() && g0.g(iVar.X(), other.X());
    }

    @k
    public static final String l0(@k String str, int i11, int i12) {
        g0.p(str, "<this>");
        int F = F(str, i11, i12);
        String substring = str.substring(F, H(str, F, i12));
        g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int m(@k String name, long j11, @l TimeUnit timeUnit) {
        g0.p(name, "name");
        if (j11 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j11);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j11 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static /* synthetic */ String m0(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return l0(str, i11, i12);
    }

    public static final void n(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void n0(@k Object obj) {
        g0.p(obj, "<this>");
        obj.wait();
    }

    public static final void o(@k Closeable closeable) {
        g0.p(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    @k
    public static final Throwable o0(@k Exception exc, @k List<? extends Exception> suppressed) {
        g0.p(exc, "<this>");
        g0.p(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            r.a(exc, it.next());
        }
        return exc;
    }

    public static final void p(@k ServerSocket serverSocket) {
        g0.p(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final void p0(@k l60.l lVar, int i11) throws IOException {
        g0.p(lVar, "<this>");
        lVar.writeByte((i11 >>> 16) & 255);
        lVar.writeByte((i11 >>> 8) & 255);
        lVar.writeByte(i11 & 255);
    }

    public static final void q(@k Socket socket) {
        g0.p(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (!g0.g(e12.getMessage(), "bio == null")) {
                throw e12;
            }
        } catch (Exception unused) {
        }
    }

    @k
    public static final String[] r(@k String[] strArr, @k String value) {
        g0.p(strArr, "<this>");
        g0.p(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        g0.o(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[a0.Oe(strArr2)] = value;
        return strArr2;
    }

    public static final int s(@k String str, char c11, int i11, int i12) {
        g0.p(str, "<this>");
        while (i11 < i12) {
            if (str.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final int t(@k String str, @k String delimiters, int i11, int i12) {
        g0.p(str, "<this>");
        g0.p(delimiters, "delimiters");
        while (i11 < i12) {
            if (k0.m3(delimiters, str.charAt(i11), false, 2, null)) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int u(String str, char c11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return s(str, c11, i11, i12);
    }

    public static /* synthetic */ int v(String str, String str2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return t(str, str2, i11, i12);
    }

    public static final boolean w(@k g1 g1Var, int i11, @k TimeUnit timeUnit) {
        g0.p(g1Var, "<this>");
        g0.p(timeUnit, "timeUnit");
        try {
            return X(g1Var, i11, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @k
    public static final <T> List<T> x(@k Iterable<? extends T> iterable, @k x00.l<? super T, Boolean> predicate) {
        g0.p(iterable, "<this>");
        g0.p(predicate, "predicate");
        List<T> J = h0.J();
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                if (J.isEmpty()) {
                    J = new ArrayList<>();
                }
                g0.n(J, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                x0.g(J).add(t11);
            }
        }
        return J;
    }

    @k
    public static final String y(@k String format, @k Object... args) {
        g0.p(format, "format");
        g0.p(args, "args");
        w0 w0Var = w0.f67050a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        g0.o(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean z(@k String[] strArr, @l String[] strArr2, @k Comparator<? super String> comparator) {
        g0.p(strArr, "<this>");
        g0.p(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a11 = kotlin.jvm.internal.h.a(strArr2);
                while (a11.hasNext()) {
                    if (comparator.compare(str, (String) a11.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
