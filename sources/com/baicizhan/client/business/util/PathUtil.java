package com.baicizhan.client.business.util;

import android.text.TextUtils;
import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PathUtil {
    public static final String BAICIZHAN_RESOURCE_EXTENSION = ".baicizhan";
    public static String BCZ_HOME = null;
    private static final String DEF_CANDIDATE_RES_DNS = "http://7n.bczcdn.com";
    private static final String DEF_DATA_DNS = "http://www.baicizhan.com";
    private static final String DEF_RES_DNS = "http://ws.bczcdn.com";

    private PathUtil() {
    }

    public static String getBaicizhanAppRoot() {
        String h11 = i9.j.h(i9.j.f60412c);
        return TextUtils.isEmpty(h11) ? StoragePathDetector.detect(pb.a.a(), null) : h11;
    }

    public static File getBaicizhanFile(String path) {
        String baicizhanAppRoot = getBaicizhanAppRoot();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        return new File(baicizhanAppRoot, path);
    }

    public static File getBaicizhanResourceFile(String fileName) {
        return getBaicizhanResourceFile(fileName, BAICIZHAN_RESOURCE_EXTENSION);
    }

    public static String getCandResDns() {
        BczSystemInfos j11 = q9.x.r().j();
        if (j11 == null) {
            return "http://7n.bczcdn.com";
        }
        List<String> list = j11.res_dns;
        return (CollectionUtils.isEmpty(list) || list.size() < 1) ? "http://ws.bczcdn.com" : list.get(1);
    }

    public static String getDataDns() {
        return DEF_DATA_DNS;
    }

    public static String getResDns() {
        BczSystemInfos j11 = q9.x.r().j();
        if (j11 == null) {
            return "http://ws.bczcdn.com";
        }
        List<String> list = j11.res_dns;
        return CollectionUtils.isEmpty(list) ? "http://ws.bczcdn.com" : list.get(0);
    }

    public static void init() {
        BCZ_HOME = getBaicizhanAppRoot();
    }

    public static boolean isBaicizhanResourceFileExist(String fileName) {
        return isBaicizhanResourceFileExist(fileName, BAICIZHAN_RESOURCE_EXTENSION);
    }

    public static String reformFmPath(String path) {
        String reformSuffix = reformSuffix(path, ".amr");
        if (reformSuffix == null) {
            reformSuffix = reformSuffix(path, ".m4a");
        }
        return reformSuffix == null ? reformSuffix(path, ".mp3") : reformSuffix;
    }

    public static String reformSuffix(String path, String suffix) {
        if (path == null) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(suffix);
        if (lastIndexOf < 0) {
            if (path.lastIndexOf(BAICIZHAN_RESOURCE_EXTENSION) > 0) {
                return path;
            }
            return null;
        }
        return path.substring(0, lastIndexOf) + BAICIZHAN_RESOURCE_EXTENSION;
    }

    public static File getBaicizhanResourceFile(String fileName, String extension) {
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        return getBaicizhanFile(FileUtils.replaceExtension(fileName, extension));
    }

    public static boolean isBaicizhanResourceFileExist(String fileName, String extension) {
        File baicizhanResourceFile = getBaicizhanResourceFile(fileName, extension);
        return baicizhanResourceFile != null && baicizhanResourceFile.exists() && baicizhanResourceFile.length() > 0;
    }
}
