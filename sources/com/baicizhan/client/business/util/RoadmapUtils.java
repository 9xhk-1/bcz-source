package com.baicizhan.client.business.util;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.RoadmapRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RoadmapUtils {
    public static final String ROADMAP_DIR = "roadmap/";
    static final Pattern ROADMAP_PATTERN = Pattern.compile("\\{\"(.*?)\":(.*?),\"(.*?)\":(.*?)\\}");
    public static final String TAG = "RoadmapUtils";

    public static String getRoadmapName(int bookId) {
        return String.format(Locale.CHINA, "road_map_%d", Integer.valueOf(bookId));
    }

    public static List<RoadmapRecord> loadRoadmap(Context context, int bookId) {
        InputStream open;
        String roadmapName = getRoadmapName(bookId);
        try {
            try {
                File baicizhanFile = PathUtil.getBaicizhanFile(new File(ROADMAP_DIR, roadmapName + PathUtil.BAICIZHAN_RESOURCE_EXTENSION).getPath());
                if (baicizhanFile == null || !baicizhanFile.exists()) {
                    qb.c.b("RoadmapUtils", "roadmap file not exists " + baicizhanFile + ", , try assets", new Object[0]);
                    open = context.getAssets().open(new File(ROADMAP_DIR, roadmapName + ".json").getPath());
                } else {
                    open = new FileInputStream(baicizhanFile);
                }
                InputStream inputStream = open;
                String readAll = FileUtils.readAll(inputStream);
                if (TextUtils.isEmpty(readAll)) {
                    qb.c.b("RoadmapUtils", "file read empty", new Object[0]);
                    List<RoadmapRecord> list = Collections.EMPTY_LIST;
                    FileUtils.closeQuietly(inputStream);
                    return list;
                }
                qb.c.i("RoadmapUtils", "json size %d", Integer.valueOf(readAll.length()));
                if (readAll.contains("[")) {
                    List<RoadmapRecord> loadRoadmapByJsonFormat = loadRoadmapByJsonFormat(readAll);
                    FileUtils.closeQuietly(inputStream);
                    return loadRoadmapByJsonFormat;
                }
                List<RoadmapRecord> loadRoadmapBySimpleFormat = loadRoadmapBySimpleFormat(readAll);
                FileUtils.closeQuietly(inputStream);
                return loadRoadmapBySimpleFormat;
            } catch (Exception e11) {
                qb.c.c("RoadmapUtils", "", e11);
                List<RoadmapRecord> list2 = Collections.EMPTY_LIST;
                FileUtils.closeQuietly(null);
                return list2;
            }
        } catch (Throwable th2) {
            FileUtils.closeQuietly(null);
            throw th2;
        }
    }

    private static List<RoadmapRecord> loadRoadmapByJsonFormat(String json) {
        if (!json.contains("topic_id") || !json.contains("tag_id")) {
            return null;
        }
        List<RoadmapRecord> list = (List) new com.google.gson.d().o(json, new bp.a<List<RoadmapRecord>>() { // from class: com.baicizhan.client.business.util.RoadmapUtils.1
        }.getType());
        qb.c.b("RoadmapUtils", "loadRoadmapByJsonFormat %d", Integer.valueOf(list == null ? 0 : list.size()));
        return list;
    }

    private static List<RoadmapRecord> loadRoadmapBySimpleFormat(String json) {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(json);
        while (scanner.hasNextLine()) {
            String trim = scanner.nextLine().trim();
            RoadmapRecord roadmapRecord = new RoadmapRecord();
            try {
                String[] split = TextUtils.split(trim, " ");
                roadmapRecord.f16070id = Integer.parseInt(split[0]);
                roadmapRecord.options = new int[split.length - 1];
                for (int i11 = 1; i11 < split.length; i11++) {
                    roadmapRecord.options[i11 - 1] = Integer.parseInt(split[i11]);
                }
                arrayList.add(roadmapRecord);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    public static boolean saveRoadmap(int bookId, List<RoadmapRecord> roadmap) {
        try {
            com.google.gson.d dVar = new com.google.gson.d();
            File baicizhanFile = PathUtil.getBaicizhanFile(new File(ROADMAP_DIR, getRoadmapName(bookId) + PathUtil.BAICIZHAN_RESOURCE_EXTENSION).getPath());
            if (baicizhanFile == null) {
                throw new IOException("roadmap file failed " + bookId);
            }
            boolean exists = baicizhanFile.getParentFile().exists();
            if (!exists) {
                exists = baicizhanFile.getParentFile().mkdirs();
            }
            if (!exists) {
                return false;
            }
            String A = dVar.A(roadmap, new bp.a<List<RoadmapRecord>>() { // from class: com.baicizhan.client.business.util.RoadmapUtils.2
            }.getType());
            qb.c.b("RoadmapUtils", "save roadmap " + baicizhanFile.getAbsolutePath() + " length " + A.length(), new Object[0]);
            FileUtils.stringToFile(baicizhanFile.getAbsolutePath(), A);
            return true;
        } catch (Exception e11) {
            qb.c.c("RoadmapUtils", "", e11);
            return false;
        }
    }
}
