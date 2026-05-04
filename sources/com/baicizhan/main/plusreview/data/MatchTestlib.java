package com.baicizhan.main.plusreview.data;

import bp.a;
import com.baicizhan.main.plusreview.data.db.MatchResultRecord;
import com.google.gson.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchTestlib {
    private Map<Integer, MatchResultRecord> result_records;
    private int review_count;
    private List<Word> review_words;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BingSentence {
        private String digest_sentence;
        private String sentence;
        private String sentence_trans;

        public String getDigest_sentence() {
            return this.digest_sentence;
        }

        public String getSentence() {
            return this.sentence;
        }

        public String getSentence_trans() {
            return this.sentence_trans;
        }

        public void setDigest_sentence(String digest_sentence) {
            this.digest_sentence = digest_sentence;
        }

        public void setSentence(String sentence) {
            this.sentence = sentence;
        }

        public void setSentence_trans(String sentence_trans) {
            this.sentence_trans = sentence_trans;
        }

        public String toString() {
            return "RightOptSentence {[sentence: " + this.sentence + "]; [sentence_trans: " + this.sentence_trans + "]; [digest_sentence: " + this.digest_sentence + "]}";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Other {
        private int en_word_id;
        private String mean_cn;
        private String word;

        public int getEn_word_id() {
            return this.en_word_id;
        }

        public String getMean_cn() {
            return this.mean_cn;
        }

        public String getWord() {
            return this.word;
        }

        public void setEn_word_id(int en_word_id) {
            this.en_word_id = en_word_id;
        }

        public void setMean_cn(String mean_cn) {
            this.mean_cn = mean_cn;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String toString() {
            return "Other {[en_word_id: " + this.en_word_id + "]; [word: " + this.word + "]; [mean_cn: " + this.mean_cn + "]}";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RightOption {
        private List<BingSentence> arr_bing_sentences;
        private int en_word_id;
        private String mean_cn;
        private String word;

        public List<BingSentence> getArr_bing_sentences() {
            return this.arr_bing_sentences;
        }

        public int getEn_word_id() {
            return this.en_word_id;
        }

        public String getMean_cn() {
            return this.mean_cn;
        }

        public String getWord() {
            return this.word;
        }

        public void setArr_bing_sentences(List<BingSentence> arr_bing_sentences) {
            this.arr_bing_sentences = arr_bing_sentences;
        }

        public void setEn_word_id(int en_word_id) {
            this.en_word_id = en_word_id;
        }

        public void setMean_cn(String mean_cn) {
            this.mean_cn = mean_cn;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String toString() {
            return "RightOption {[en_word_id: " + this.en_word_id + "]; [word: " + this.word + "]; [mean_cn: " + this.mean_cn + "]; [arr_bing_sentences: " + this.arr_bing_sentences + "]}";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Word {
        private List<Other> arr_other_options;
        private List<RightOption> arr_right_options;
        private int type_hint;
        private int word_topic_id;

        public List<Other> getArr_other_options() {
            return this.arr_other_options;
        }

        public List<RightOption> getArr_right_options() {
            return this.arr_right_options;
        }

        public int getType_hint() {
            return this.type_hint;
        }

        public int getWord_topic_id() {
            return this.word_topic_id;
        }

        public void setArr_other_options(List<Other> arr_other_options) {
            this.arr_other_options = arr_other_options;
        }

        public void setArr_right_options(List<RightOption> arr_right_options) {
            this.arr_right_options = arr_right_options;
        }

        public void setType_hint(int type_hint) {
            this.type_hint = type_hint;
        }

        public void setWord_topic_id(int word_topic_id) {
            this.word_topic_id = word_topic_id;
        }

        public String toString() {
            return "Word {[word_topic_id: " + this.word_topic_id + "]; [type_hint: " + this.type_hint + "]; [arr_right_options: " + this.arr_right_options + "]; [arr_other_options: " + this.arr_other_options + "]}";
        }
    }

    public static MatchTestlib parse(String json) {
        return (MatchTestlib) new d().o(json, new a<MatchTestlib>() { // from class: com.baicizhan.main.plusreview.data.MatchTestlib.1
        }.getType());
    }

    public Map<Integer, MatchResultRecord> getResult_records() {
        return this.result_records;
    }

    public int getReview_count() {
        return this.review_count;
    }

    public List<Word> getReview_words() {
        return this.review_words;
    }

    public List<Integer> getTopicIds(int start, int size) {
        if (this.review_words == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size2 = this.review_words.size();
        int i11 = 0;
        while (start < size2) {
            arrayList.add(Integer.valueOf(this.review_words.get(start).word_topic_id));
            i11++;
            if (i11 == size) {
                break;
            }
            start++;
        }
        return arrayList;
    }

    public List<Integer> getUnfinishedTopicIds(int size) {
        MatchResultRecord matchResultRecord;
        if (this.review_words == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Word word : this.review_words) {
            Map<Integer, MatchResultRecord> map = this.result_records;
            if (map != null && (matchResultRecord = map.get(Integer.valueOf(word.word_topic_id))) != null && matchResultRecord.getResult() != 1) {
                arrayList.add(Integer.valueOf(word.word_topic_id));
                i11++;
            }
        }
        return arrayList;
    }

    public boolean isEmpty() {
        List<Word> list;
        return this.review_count <= 0 || (list = this.review_words) == null || list.isEmpty();
    }

    public void setResult_records(Map<Integer, MatchResultRecord> result_records) {
        this.result_records = result_records;
    }

    public void setReview_count(int review_count) {
        this.review_count = review_count;
    }

    public void setReview_words(List<Word> review_words) {
        this.review_words = review_words;
    }

    public String toString() {
        return "MatchTestlib {review_words [" + this.review_words + "]}";
    }

    public List<Integer> getTopicIds(int size) {
        if (this.review_words == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Word> it = this.review_words.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().word_topic_id));
            i11++;
            if (i11 == size) {
                break;
            }
        }
        return arrayList;
    }
}
