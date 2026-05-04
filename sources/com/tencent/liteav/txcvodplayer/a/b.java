package com.tencent.liteav.txcvodplayer.a;

import android.net.Uri;
import android.util.Log;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44202a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static b f44203b = new b();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f44204c;

    /* renamed from: d, reason: collision with root package name */
    private HashSet<a> f44205d;

    /* renamed from: e, reason: collision with root package name */
    private String f44206e;

    /* renamed from: f, reason: collision with root package name */
    private int f44207f;

    /* renamed from: g, reason: collision with root package name */
    private String f44208g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Serializable {
        String fileType;
        String path;
        Long time;
        String url;

        public String a() {
            return this.url;
        }

        public String b() {
            return this.path;
        }

        public Long c() {
            return this.time;
        }

        public String d() {
            String str;
            if (this.fileType == null && (str = this.path) != null) {
                if (str.endsWith("mp4")) {
                    return "mp4";
                }
                if (this.path.endsWith("m3u8.sqlite")) {
                    return IjkMediaMeta.IJKM_KEY_M3U8;
                }
            }
            return this.fileType;
        }

        public void a(String str) {
            this.url = str;
        }

        public void b(String str) {
            this.path = str;
        }

        public void c(String str) {
            this.fileType = str;
        }

        public void a(Long l11) {
            this.time = l11;
        }
    }

    public static b a() {
        return f44203b;
    }

    public static String g(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b11 : digest) {
                int i11 = b11 & 255;
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public void b(String str) {
        String concat = str.endsWith("/") ? str.concat("vodcache") : str.concat("/vodcache");
        String str2 = this.f44206e;
        if (str2 == null || !str2.equals(concat)) {
            this.f44206e = concat;
            if (concat == null) {
                return;
            }
            new File(this.f44206e).mkdirs();
            if (b()) {
                return;
            }
            e();
        }
    }

    public String c(String str) {
        int indexOf;
        int indexOf2 = str.indexOf("voddrm.token.");
        if (indexOf2 > -1 && (indexOf = str.indexOf(".", indexOf2 + 13)) > -1 && indexOf < str.length() - 1) {
            str = str.substring(0, indexOf2) + str.substring(indexOf + 1);
        }
        int indexOf3 = str.indexOf("?");
        return indexOf3 > -1 ? str.substring(0, indexOf3) : str;
    }

    public boolean e(String str) {
        Uri parse = Uri.parse(str);
        if (parse == null || parse.getPath() == null || parse.getScheme() == null || !parse.getScheme().startsWith("http")) {
            return false;
        }
        return parse.getPath().endsWith(".mp4") || parse.getPath().endsWith(IjkMediaMeta.IJKM_KEY_M3U8) || parse.getPath().endsWith(".MP4") || parse.getPath().endsWith("M3U8");
    }

    public a f(String str) {
        a aVar = new a();
        aVar.url = str;
        aVar.time = Long.valueOf(System.currentTimeMillis());
        String g11 = g(str);
        Uri parse = Uri.parse(str);
        if (parse.getPath().endsWith(".mp4") || parse.getPath().endsWith(".MP4")) {
            if (this.f44208g != null) {
                aVar.b(g11 + "." + this.f44208g);
            } else {
                aVar.b(g11 + ".mp4");
            }
            aVar.c("mp4");
        } else {
            if (!parse.getPath().endsWith(".m3u8") && !parse.getPath().endsWith(".M3U8")) {
                return null;
            }
            aVar.b(g11 + ".m3u8.sqlite");
            aVar.c(IjkMediaMeta.IJKM_KEY_M3U8);
        }
        this.f44204c.add(aVar);
        c();
        return aVar;
    }

    public void a(int i11) {
        this.f44207f = i11;
    }

    public com.tencent.liteav.txcvodplayer.a.a d(String str) {
        if (this.f44206e != null && str != null) {
            String c11 = c(str);
            File file = new File(this.f44206e);
            if (!file.mkdirs() && !file.isDirectory()) {
                return null;
            }
            Iterator<a> it = this.f44204c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.url.equals(c11)) {
                    a(next);
                    this.f44205d.add(next);
                    return new com.tencent.liteav.txcvodplayer.a.a(next.path, this.f44206e, next.fileType);
                }
            }
            Iterator<a> it2 = this.f44204c.iterator();
            while (it2.hasNext() && this.f44204c.size() > this.f44207f) {
                a next2 = it2.next();
                if (!this.f44205d.contains(next2)) {
                    b(next2);
                    it2.remove();
                }
            }
            a f11 = f(c11);
            if (f11 != null) {
                this.f44205d.add(f11);
                return new com.tencent.liteav.txcvodplayer.a.a(f11.path, this.f44206e, f11.fileType);
            }
        }
        return null;
    }

    public void a(String str) {
        this.f44208g = str;
    }

    public void a(a aVar) {
        aVar.time = Long.valueOf(System.currentTimeMillis());
        this.f44204c.remove(aVar);
        this.f44204c.add(aVar);
        c();
    }

    private void e() {
        if (new File(this.f44206e).listFiles().length > 0) {
            Log.w(f44202a, "!!!Warning: TXVodPlayer cache directory is not empty " + this.f44206e + "!!!");
        }
    }

    private void a(String str, final String str2) {
        final String str3 = this.f44206e + "/" + str;
        new Thread(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                new File(str3).delete();
                if (str2.equals("mp4")) {
                    new File(str3.concat(".info")).delete();
                }
                Log.w(b.f44202a, "delete " + str3);
            }
        }, "vodCacheMgrDelfile").start();
    }

    public void c() {
        try {
            Document newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element createElement = newDocument.createElement("caches");
            newDocument.appendChild(createElement);
            Iterator<a> it = this.f44204c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                Element createElement2 = newDocument.createElement("cache");
                createElement.appendChild(createElement2);
                Element createElement3 = newDocument.createElement("path");
                createElement3.appendChild(newDocument.createTextNode(next.b()));
                createElement2.appendChild(createElement3);
                Element createElement4 = newDocument.createElement("time");
                createElement4.appendChild(newDocument.createTextNode(next.c().toString()));
                createElement2.appendChild(createElement4);
                Element createElement5 = newDocument.createElement("url");
                createElement5.appendChild(newDocument.createTextNode(next.a()));
                createElement2.appendChild(createElement5);
                Element createElement6 = newDocument.createElement("fileType");
                createElement6.appendChild(newDocument.createTextNode(next.d()));
                createElement2.appendChild(createElement6);
            }
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            DOMSource dOMSource = new DOMSource(newDocument);
            StreamResult streamResult = new StreamResult();
            streamResult.setSystemId(new File(this.f44206e, "tx_cache.xml").getAbsolutePath());
            newTransformer.transform(dOMSource, streamResult);
            System.out.println("File saved!");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public boolean b() {
        this.f44204c = new ArrayList<>();
        this.f44205d = new HashSet<>();
        try {
            for (Node firstChild = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(this.f44206e + "/tx_cache.xml")).getElementsByTagName("caches").item(0).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                a aVar = new a();
                for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNextSibling()) {
                    if (firstChild2.getNodeName().equals("path")) {
                        aVar.b(firstChild2.getFirstChild().getNodeValue());
                    } else if (firstChild2.getNodeName().equals("time")) {
                        aVar.a(Long.valueOf(Long.parseLong(firstChild2.getFirstChild().getNodeValue())));
                    } else if (firstChild2.getNodeName().equals("url")) {
                        aVar.a(firstChild2.getFirstChild().getNodeValue());
                    } else if (firstChild2.getNodeName().equals("fileType")) {
                        aVar.c(firstChild2.getFirstChild().getNodeValue());
                    }
                }
                this.f44204c.add(aVar);
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    public void a(String str, boolean z11) {
        Iterator<a> it = this.f44205d.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b().equals(str)) {
                it.remove();
                if (z11) {
                    b(next);
                    this.f44204c.remove(next);
                    c();
                }
            }
        }
    }

    private void b(a aVar) {
        a(aVar.b(), aVar.d());
    }
}
