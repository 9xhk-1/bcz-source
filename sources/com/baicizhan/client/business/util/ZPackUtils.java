package com.baicizhan.client.business.util;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.ZResource;
import com.baicizhan.client.business.dataset.models.ZWiki;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.j2;
import ya.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ZPackUtils {
    public static final String META_JSON = "meta.json";
    public static final String RESOURCE_JSON = "resource.json";
    private static String TAG = "ZPackUtils";
    public static final String WIKI_JSON = "wiki.json";
    public static final String ZPK_ROOT = "zpack";
    private static final int ZPK_SCATTER_FACTOR = 32;
    private static final int ZPK_SCATTER_MASK = 31;
    public static final Type TOPIC_TYPE = new bp.a<TopicRecord>() { // from class: com.baicizhan.client.business.util.ZPackUtils.1
    }.getType();
    public static final Type RESOURCE_TYPE = new bp.a<ZResource>() { // from class: com.baicizhan.client.business.util.ZPackUtils.2
    }.getType();
    public static final Type WIKI_TYPE = new bp.a<ZWiki>() { // from class: com.baicizhan.client.business.util.ZPackUtils.3
    }.getType();
    public static com.google.gson.d META_GSON = new com.google.gson.e().e();
    public static final Pattern ZPK_NAME_PATTERN = Pattern.compile("zp_(\\d+)_(\\d+)_(\\d+)_(\\d+)_(\\d+)\\.zpk");
    public static final Pattern ZPK_NAME_PATTERN_v2 = Pattern.compile("zp_(\\d+)_(\\d+)_(\\d+)_(\\d+)\\.zpk");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ZpkNameInfo {
        public int bookId;
        public int tagId;
        public String timestamp;
        public int topicId;
        public int version;

        public String toString() {
            return new JsonSerializer(new bp.a<ZpkNameInfo>() { // from class: com.baicizhan.client.business.util.ZPackUtils.ZpkNameInfo.1
            }.getType()).writeToJson(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point calcBitmapSizeCompat(com.baicizhan.client.business.dataset.models.TopicRecord r5, java.lang.String r6) {
        /*
            java.io.File r0 = getZpkFile(r5)
            if (r0 == 0) goto L6d
            boolean r1 = r0.exists()
            if (r1 == 0) goto L6d
            r1 = 0
            ya.e r2 = new ya.e     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r4 = 1
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r6 = com.baicizhan.client.business.util.FileUtils.getFileName(r6)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            java.io.InputStream r6 = r2.t(r6)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            r3.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            android.graphics.BitmapFactory.decodeStream(r6, r1, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            android.graphics.Point r6 = new android.graphics.Point     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            r6.<init>()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            int r4 = r3.outWidth     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            r6.x = r4     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            int r3 = r3.outHeight     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            r6.y = r3     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L40
            r2.d()
            return r6
        L3a:
            r5 = move-exception
            r1 = r2
            goto L67
        L3d:
            r5 = move-exception
            goto L67
        L3f:
            r2 = r1
        L40:
            java.lang.String r6 = com.baicizhan.client.business.util.ZPackUtils.TAG     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r3.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "zpk img failed: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3a
            r3.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = ", "
            r3.append(r0)     // Catch: java.lang.Throwable -> L3a
            r3.append(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L3a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3a
            qb.c.b(r6, r5, r0)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L66
            r2.d()
        L66:
            return r1
        L67:
            if (r1 == 0) goto L6c
            r1.d()
        L6c:
            throw r5
        L6d:
            java.lang.String r5 = r5.deformationImagePath
            java.io.File r5 = com.baicizhan.client.business.util.PathUtil.getBaicizhanResourceFile(r5)
            android.graphics.Point r5 = com.baicizhan.client.business.util.PicassoUtil.getBitmapSize(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.ZPackUtils.calcBitmapSizeCompat(com.baicizhan.client.business.dataset.models.TopicRecord, java.lang.String):android.graphics.Point");
    }

    private static void copyAndPlay(final File zpkfile, final String audioName, final IAudioPlayer player) {
        rx.c.M2(zpkfile).c3(new wb0.p<File, File>() { // from class: com.baicizhan.client.business.util.ZPackUtils.5
            @Override // wb0.p
            public File call(File file) {
                Throwable th2;
                Exception exc;
                ya.e eVar;
                Throwable th3;
                FileChannel fileChannel;
                Exception exc2;
                ya.e eVar2 = null;
                r1 = null;
                FileChannel fileChannel2 = null;
                eVar2 = null;
                try {
                    try {
                        eVar = new ya.e(file.getAbsolutePath(), 1);
                    } catch (Exception e11) {
                        exc = e11;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
                try {
                    e.a m11 = eVar.m(audioName);
                    File file2 = new File(pb.a.a().getExternalCacheDir(), m11.g());
                    if (file2.exists()) {
                        file2.delete();
                    }
                    try {
                        FileChannel i11 = eVar.i();
                        try {
                            fileChannel = new FileOutputStream(file2).getChannel();
                            try {
                                i11.transferTo(m11.f(), m11.e(), fileChannel);
                                i11.close();
                            } catch (Exception e12) {
                                exc2 = e12;
                                fileChannel2 = i11;
                                try {
                                    qb.c.c(ZPackUtils.TAG, "", exc2);
                                    fileChannel2.close();
                                    fileChannel.close();
                                    eVar.d();
                                    return file2;
                                } catch (Throwable th5) {
                                    th3 = th5;
                                    fileChannel2.close();
                                    fileChannel.close();
                                    throw th3;
                                }
                            } catch (Throwable th6) {
                                th3 = th6;
                                fileChannel2 = i11;
                                fileChannel2.close();
                                fileChannel.close();
                                throw th3;
                            }
                        } catch (Exception e13) {
                            exc2 = e13;
                            fileChannel = null;
                        } catch (Throwable th7) {
                            th3 = th7;
                            fileChannel = null;
                        }
                    } catch (Exception e14) {
                        exc2 = e14;
                        fileChannel = null;
                    } catch (Throwable th8) {
                        th3 = th8;
                        fileChannel = null;
                    }
                    fileChannel.close();
                    eVar.d();
                    return file2;
                } catch (Exception e15) {
                    exc = e15;
                    eVar2 = eVar;
                    throw vb0.a.c(exc);
                } catch (Throwable th9) {
                    th2 = th9;
                    eVar2 = eVar;
                    if (eVar2 == null) {
                        throw th2;
                    }
                    eVar2.d();
                    throw th2;
                }
            }
        }).I3(tb0.a.a()).w5(bc0.c.e()).r5(new qb0.g<File>() { // from class: com.baicizhan.client.business.util.ZPackUtils.4
            @Override // qb0.c
            public void onError(Throwable e11) {
                qb.c.c(ZPackUtils.TAG, "zpk audio failed" + zpkfile + "name " + audioName + "  try playInZpk ", e11);
                ZPackUtils.playInZpk(zpkfile, player, audioName);
            }

            @Override // qb0.c
            public void onNext(File file) {
                player.e(file);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        });
    }

    public static boolean deleteZpk(TopicRecord record) {
        File zpkFile = getZpkFile(record);
        return zpkFile != null && zpkFile.delete();
    }

    public static ZpkNameInfo extractZpkNameInfo(String zpkName) {
        try {
            Matcher matcher = ZPK_NAME_PATTERN.matcher(FileUtils.getFileName(zpkName));
            Matcher matcher2 = ZPK_NAME_PATTERN_v2.matcher(FileUtils.getFileName(zpkName));
            ZpkNameInfo zpkNameInfo = new ZpkNameInfo();
            if (matcher.matches()) {
                zpkNameInfo.topicId = Integer.valueOf(matcher.group(1)).intValue();
                zpkNameInfo.bookId = Integer.valueOf(matcher.group(2)).intValue();
                zpkNameInfo.tagId = Integer.valueOf(matcher.group(3)).intValue();
                zpkNameInfo.version = Integer.valueOf(matcher.group(4)).intValue();
                zpkNameInfo.timestamp = matcher.group(5);
                return zpkNameInfo;
            }
            if (!matcher2.matches()) {
                return null;
            }
            zpkNameInfo.topicId = Integer.valueOf(matcher2.group(1)).intValue();
            zpkNameInfo.bookId = Integer.valueOf(matcher2.group(2)).intValue();
            zpkNameInfo.tagId = Integer.valueOf(matcher2.group(3)).intValue();
            zpkNameInfo.timestamp = matcher2.group(4);
            return zpkNameInfo;
        } catch (Exception e11) {
            qb.c.d(TAG, e11.toString(), new Object[0]);
            return null;
        }
    }

    public static File getZpkFile(TopicRecord record) {
        if (TextUtils.isEmpty(record.zpkName)) {
            return null;
        }
        return getZpkFileByName(record.bookId, record.zpkName);
    }

    public static File getZpkFileByName(int bookId, String name) {
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        String name2 = new File(name).getName();
        return PathUtil.getBaicizhanFile(String.format("%s/%d/%d/%s", ZPK_ROOT, Integer.valueOf(bookId), Integer.valueOf(name2.hashCode() & 31), name2));
    }

    public static int getZpkTagIdCompat(TopicRecord record) {
        ZpkNameInfo extractZpkNameInfo;
        if (TextUtils.isEmpty(record.zpkName) || (extractZpkNameInfo = extractZpkNameInfo(record.zpkName)) == null) {
            return 0;
        }
        return extractZpkNameInfo.tagId;
    }

    public static boolean isZpkExists(int bookId, String name) {
        File zpkFileByName;
        return bookId > 0 && !TextUtils.isEmpty(name) && (zpkFileByName = getZpkFileByName(bookId, name)) != null && zpkFileByName.exists() && zpkFileByName.length() > 0;
    }

    public static boolean loadAudioCompat(IAudioPlayer player, TopicRecord record, String audioName) {
        File zpkFile = getZpkFile(record);
        if (zpkFile == null || !zpkFile.exists()) {
            return player.e(PathUtil.getBaicizhanResourceFile(audioName));
        }
        if (!DeviceUtil.isHuawei()) {
            return playInZpk(zpkFile, player, audioName);
        }
        copyAndPlay(zpkFile, audioName, player);
        return true;
    }

    public static ic.c loadImageCompat(TopicRecord record, String imageName) {
        File zpkFile = getZpkFile(record);
        if (zpkFile != null && zpkFile.exists()) {
            return hc.c.j(ZpkConfig.getImageUri(zpkFile.getAbsolutePath(), FileUtils.getFileName(imageName)));
        }
        qb.c.i(TAG, "FILE NOT FOUND %s %s %s", imageName, zpkFile == null ? "null" : zpkFile.getAbsolutePath(), record.toString());
        return hc.c.k(PathUtil.getBaicizhanResourceFile(imageName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean playInZpk(File zpkFile, IAudioPlayer player, String audioName) {
        Throwable th2;
        ya.e eVar;
        ya.e eVar2 = null;
        try {
            try {
                eVar = new ya.e(zpkFile.getAbsolutePath(), 1);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            boolean d11 = player.d(eVar.j(), eVar.m(audioName).f(), r0.e());
            eVar.d();
            return d11;
        } catch (Exception unused2) {
            eVar2 = eVar;
            qb.c.d(TAG, "zpk audio failed " + zpkFile + j2.O + audioName, new Object[0]);
            if (eVar2 != null) {
                eVar2.d();
            }
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            eVar2 = eVar;
            if (eVar2 == null) {
                throw th2;
            }
            eVar2.d();
            throw th2;
        }
    }

    public static boolean playZpkAudio(IAudioPlayer audioPlayer, String zpkPath, String audioName) {
        Throwable th2;
        ya.e eVar;
        ya.e eVar2 = null;
        try {
            try {
                eVar = new ya.e(zpkPath, 1);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            boolean d11 = audioPlayer.d(eVar.j(), eVar.m(audioName).f(), r0.e());
            eVar.d();
            return d11;
        } catch (Exception unused2) {
            eVar2 = eVar;
            qb.c.d(TAG, "zpk audio failed " + zpkPath + j2.O + audioName, new Object[0]);
            if (eVar2 != null) {
                eVar2.d();
            }
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            eVar2 = eVar;
            if (eVar2 == null) {
                throw th2;
            }
            eVar2.d();
            throw th2;
        }
    }

    public static TopicRecord readMeatTopicRecordByName(int bookId, String zpkName) {
        File zpkFileByName = getZpkFileByName(bookId, zpkName);
        if (zpkFileByName == null || zpkFileByName.length() == 0) {
            return null;
        }
        return readMetaTopicRecord(bookId, zpkFileByName.getAbsolutePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baicizhan.client.business.dataset.models.TopicRecord readMetaTopicRecord(int r6, java.lang.String r7) {
        /*
            r0 = 0
            ya.e r1 = new ya.e     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r2 = 1
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String r2 = "meta.json"
            java.io.InputStream r2 = r1.t(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            com.google.gson.d r4 = com.baicizhan.client.business.util.ZPackUtils.META_GSON     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            java.lang.reflect.Type r5 = com.baicizhan.client.business.util.ZPackUtils.TOPIC_TYPE     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            java.lang.Object r4 = r4.m(r3, r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            com.baicizhan.client.business.dataset.models.TopicRecord r4 = (com.baicizhan.client.business.dataset.models.TopicRecord) r4     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r4.bookId = r6     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r2.close()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r3.close()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r1.d()
            return r4
        L2d:
            r6 = move-exception
            r0 = r1
            goto L52
        L30:
            r6 = move-exception
            goto L52
        L32:
            r1 = r0
        L33:
            java.lang.String r6 = com.baicizhan.client.business.util.ZPackUtils.TAG     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "zpk meta failed: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            r2.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2d
            qb.c.b(r6, r7, r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L51
            r1.d()
        L51:
            return r0
        L52:
            if (r0 == 0) goto L57
            r0.d()
        L57:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.ZPackUtils.readMetaTopicRecord(int, java.lang.String):com.baicizhan.client.business.dataset.models.TopicRecord");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baicizhan.client.business.dataset.models.ZResource readResource(int r5, java.lang.String r6) {
        /*
            java.io.File r5 = getZpkFileByName(r5, r6)
            r6 = 0
            if (r5 == 0) goto L7a
            long r0 = r5.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L12
            goto L7a
        L12:
            java.lang.String r5 = r5.getAbsolutePath()
            ya.e r0 = new ya.e     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r1 = 1
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r1 = "resource.json"
            java.io.InputStream r1 = r0.t(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            com.google.gson.d r3 = com.baicizhan.client.business.util.ZPackUtils.META_GSON     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.reflect.Type r4 = com.baicizhan.client.business.util.ZPackUtils.RESOURCE_TYPE     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.Object r3 = r3.m(r2, r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            com.baicizhan.client.business.dataset.models.ZResource r3 = (com.baicizhan.client.business.dataset.models.ZResource) r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r1.close()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.close()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r0.d()
            return r3
        L40:
            r5 = move-exception
            r6 = r0
            goto L74
        L43:
            r1 = move-exception
            goto L49
        L45:
            r5 = move-exception
            goto L74
        L47:
            r1 = move-exception
            r0 = r6
        L49:
            java.lang.String r2 = com.baicizhan.client.business.util.ZPackUtils.TAG     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "zpk meta failed: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L40
            r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "error:"
            r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r1.getMessage()     // Catch: java.lang.Throwable -> L40
            r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L40
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            qb.c.d(r2, r5, r1)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L73
            r0.d()
        L73:
            return r6
        L74:
            if (r6 == 0) goto L79
            r6.d()
        L79:
            throw r5
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.ZPackUtils.readResource(int, java.lang.String):com.baicizhan.client.business.dataset.models.ZResource");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baicizhan.client.business.dataset.models.ZWiki readWiki(int r5, java.lang.String r6) {
        /*
            java.io.File r5 = getZpkFileByName(r5, r6)
            r6 = 0
            if (r5 == 0) goto L6b
            long r0 = r5.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L12
            goto L6b
        L12:
            java.lang.String r5 = r5.getAbsolutePath()
            ya.e r0 = new ya.e     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            r1 = 1
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L45
            java.lang.String r1 = "wiki.json"
            java.io.InputStream r1 = r0.t(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            com.google.gson.d r3 = com.baicizhan.client.business.util.ZPackUtils.META_GSON     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            java.lang.reflect.Type r4 = com.baicizhan.client.business.util.ZPackUtils.WIKI_TYPE     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            java.lang.Object r3 = r3.m(r2, r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            com.baicizhan.client.business.dataset.models.ZWiki r3 = (com.baicizhan.client.business.dataset.models.ZWiki) r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            r1.close()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            r2.close()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L46
            r0.d()
            return r3
        L40:
            r5 = move-exception
            r6 = r0
            goto L65
        L43:
            r5 = move-exception
            goto L65
        L45:
            r0 = r6
        L46:
            java.lang.String r1 = com.baicizhan.client.business.util.ZPackUtils.TAG     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "zpk meta failed: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L40
            r2.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L40
            qb.c.b(r1, r5, r2)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L64
            r0.d()
        L64:
            return r6
        L65:
            if (r6 == 0) goto L6a
            r6.d()
        L6a:
            throw r5
        L6b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.ZPackUtils.readWiki(int, java.lang.String):com.baicizhan.client.business.dataset.models.ZWiki");
    }

    public static boolean resourceFileExistsCompat(TopicRecord record, String name) {
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        File zpkFile = getZpkFile(record);
        return (zpkFile == null || !zpkFile.exists()) ? PathUtil.isBaicizhanResourceFileExist(name) : !TextUtils.isEmpty(name);
    }

    public static boolean isZpkExists(TopicRecord record) {
        return isZpkExists(record.bookId, record.zpkName);
    }
}
