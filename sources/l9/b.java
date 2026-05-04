package l9;

import com.baicizhan.client.business.dataset.models.WordMediaMidRecord;
import com.baicizhan.online.bs_words.BBWordMediaHalftimeList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {
    public static List<WordMediaMidRecord> a(BBWordMediaHalftimeList froms) {
        if (froms == null) {
            return null;
        }
        List<String> word_fm_halftime_list = froms.getWord_fm_halftime_list();
        List<String> word_tv_halftime_list = froms.getWord_tv_halftime_list();
        List<String> word_fm_head_list = froms.getWord_fm_head_list();
        List<String> word_fm_tail_list = froms.getWord_fm_tail_list();
        if (word_fm_halftime_list == null && word_tv_halftime_list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (word_fm_halftime_list != null) {
            for (String str : word_fm_halftime_list) {
                WordMediaMidRecord wordMediaMidRecord = new WordMediaMidRecord();
                wordMediaMidRecord.setPath(str);
                wordMediaMidRecord.setType(0);
                arrayList.add(wordMediaMidRecord);
            }
        }
        if (word_tv_halftime_list != null) {
            for (String str2 : word_tv_halftime_list) {
                WordMediaMidRecord wordMediaMidRecord2 = new WordMediaMidRecord();
                wordMediaMidRecord2.setPath(str2);
                wordMediaMidRecord2.setType(1);
                arrayList.add(wordMediaMidRecord2);
            }
        }
        if (word_fm_head_list != null) {
            for (String str3 : word_fm_head_list) {
                WordMediaMidRecord wordMediaMidRecord3 = new WordMediaMidRecord();
                wordMediaMidRecord3.setPath(str3);
                wordMediaMidRecord3.setType(2);
                arrayList.add(wordMediaMidRecord3);
            }
        }
        if (word_fm_tail_list != null) {
            for (String str4 : word_fm_tail_list) {
                WordMediaMidRecord wordMediaMidRecord4 = new WordMediaMidRecord();
                wordMediaMidRecord4.setPath(str4);
                wordMediaMidRecord4.setType(3);
                arrayList.add(wordMediaMidRecord4);
            }
        }
        return arrayList;
    }
}
