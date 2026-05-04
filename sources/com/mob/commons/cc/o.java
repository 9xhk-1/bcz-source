package com.mob.commons.cc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

/* loaded from: classes7.dex */
public class o {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<Object> f40256a;

        /* renamed from: b, reason: collision with root package name */
        private DataInputStream f40257b;

        /* renamed from: c, reason: collision with root package name */
        private int f40258c;

        /* renamed from: d, reason: collision with root package name */
        private int f40259d;

        public <T> T a() throws Throwable {
            int i11 = this.f40258c;
            return i11 != 1 ? i11 != 2 ? (T) this.f40256a.get(this.f40257b.readInt()) : (T) this.f40256a.get(this.f40257b.readShort()) : (T) this.f40256a.get(this.f40257b.read());
        }

        public int b() {
            return this.f40259d;
        }

        private a(ArrayList<Object> arrayList, DataInputStream dataInputStream, int i11, int i12) {
            this.f40256a = arrayList;
            this.f40257b = dataInputStream;
            this.f40258c = i11;
            this.f40259d = i12;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private c f40260a;

        public b a(Object obj) {
            this.f40260a.a(obj);
            return this;
        }

        private b(Object obj) {
            this.f40260a = new c(obj);
        }

        public c a(String str, Class<?> cls) {
            return this.f40260a.a(str, cls);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<Object> f40261a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<Object> f40262b;

        /* renamed from: c, reason: collision with root package name */
        private HashMap<String, Object> f40263c;

        private c(Object obj) {
            ArrayList<Object> arrayList = new ArrayList<>();
            this.f40261a = arrayList;
            arrayList.add(obj);
            this.f40262b = new ArrayList<>();
            this.f40263c = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj) {
            this.f40261a.add(obj);
        }

        public c a(String str, Object obj) {
            this.f40263c.put(str, obj);
            return this;
        }

        public c a(String str, Class<?> cls) {
            l.f40252a.put(str, cls);
            return this;
        }

        public void a() throws Throwable {
            InputStream byteArrayInputStream;
            ArrayList<p> arrayList = new ArrayList<>();
            Iterator<Object> it = this.f40261a.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    byteArrayInputStream = new FileInputStream((String) next);
                } else if (next instanceof byte[]) {
                    byteArrayInputStream = new ByteArrayInputStream((byte[]) next);
                } else {
                    throw new ClassCastException("program is not string or byte array");
                }
                a(byteArrayInputStream, arrayList);
                byteArrayInputStream.close();
            }
            new l(arrayList, this.f40262b).a(this.f40263c);
        }

        private void a(InputStream inputStream, ArrayList<p> arrayList) throws Throwable {
            DataInputStream dataInputStream;
            if (inputStream.read() != 3) {
                return;
            }
            if (inputStream.read() == 1) {
                dataInputStream = new DataInputStream(new GZIPInputStream(inputStream));
            } else {
                dataInputStream = new DataInputStream(inputStream);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(null);
            int readInt = dataInputStream.readInt();
            for (int i11 = 0; i11 < readInt; i11++) {
                arrayList2.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int readInt2 = dataInputStream.readInt();
            for (int i12 = 0; i12 < readInt2; i12++) {
                arrayList2.add(Long.valueOf(dataInputStream.readLong()));
            }
            int readInt3 = dataInputStream.readInt();
            for (int i13 = 0; i13 < readInt3; i13++) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            int readInt4 = dataInputStream.readInt();
            for (int i14 = 0; i14 < readInt4; i14++) {
                arrayList2.add(Double.valueOf(dataInputStream.readDouble()));
            }
            int readInt5 = dataInputStream.readInt();
            for (int i15 = 0; i15 < readInt5; i15++) {
                arrayList2.add(Boolean.valueOf(dataInputStream.readBoolean()));
            }
            int readInt6 = dataInputStream.readInt();
            for (int i16 = 0; i16 < readInt6; i16++) {
                arrayList2.add(dataInputStream.readUTF());
            }
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            a aVar = new a(arrayList2, dataInputStream, read, arrayList.size());
            int readInt7 = dataInputStream.readInt();
            boolean readBoolean = dataInputStream.readBoolean();
            for (int i17 = 0; i17 < readInt7; i17++) {
                p pVar = new p();
                pVar.f40264a = dataInputStream.readByte();
                if (readBoolean) {
                    if (read == 1) {
                        pVar.f40265b = (String) arrayList2.get(dataInputStream.readByte());
                    } else if (read != 2) {
                        pVar.f40265b = (String) arrayList2.get(dataInputStream.readInt());
                    } else {
                        pVar.f40265b = (String) arrayList2.get(dataInputStream.readShort());
                    }
                    if (read2 == 1) {
                        pVar.f40266c = dataInputStream.readByte();
                    } else if (read2 != 2) {
                        pVar.f40266c = dataInputStream.readInt();
                    } else {
                        pVar.f40266c = dataInputStream.readShort();
                    }
                }
                pVar.a(aVar);
                arrayList.add(pVar);
            }
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            k.a(new String(bArr, "utf-8"));
        }
    }

    public static int a() {
        return 3;
    }

    public static b a(String... strArr) {
        return a((Object[]) strArr);
    }

    public static b a(byte[]... bArr) {
        return a((Object[]) bArr);
    }

    private static b a(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        b bVar = new b(objArr[0]);
        for (int i11 = 1; i11 < objArr.length; i11++) {
            bVar.a(objArr[i11]);
        }
        return bVar;
    }
}
