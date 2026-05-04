package com.baicizhan.client.business.dataset.models;

import com.baicizhan.online.user_study_api.UserRoadMapElementV2;
import java.util.Arrays;
import java.util.Locale;
import ma.b;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RoadmapRecord {

    /* renamed from: id, reason: collision with root package name */
    @c("topic_id")
    public int f16070id;
    public int[] options;

    @c("tag_id")
    public int tag_id;

    @c(b.f72894c)
    public int word_level_id;

    public static RoadmapRecord from(UserRoadMapElementV2 t11) {
        RoadmapRecord roadmapRecord = new RoadmapRecord();
        roadmapRecord.f16070id = t11.getTopic_id();
        roadmapRecord.tag_id = t11.getTag_id();
        roadmapRecord.word_level_id = t11.getWord_level_id();
        roadmapRecord.options = new int[t11.getOptions().size()];
        int i11 = 0;
        while (true) {
            int[] iArr = roadmapRecord.options;
            if (i11 >= iArr.length) {
                return roadmapRecord;
            }
            iArr[i11] = t11.getOptions().get(i11).intValue();
            i11++;
        }
    }

    public int getId() {
        return this.f16070id;
    }

    public int[] getOptions() {
        return this.options;
    }

    public int getTagId() {
        return this.tag_id;
    }

    public void setId(int id2) {
        this.f16070id = id2;
    }

    public void setOptions(int[] options) {
        this.options = options;
    }

    public void setTagId(int tag_id) {
        this.tag_id = tag_id;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "RoadmapRecord {id = %d, bookid = %d, tagId = %d, options = %s}", Integer.valueOf(this.f16070id), Integer.valueOf(this.word_level_id), Integer.valueOf(this.tag_id), Arrays.toString(this.options));
    }
}
