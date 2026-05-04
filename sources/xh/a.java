package xh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.selftest.activity.SelfTestActivity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final String f98060b = "topic_record";

    /* renamed from: a, reason: collision with root package name */
    public TopicRecord f98061a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xh.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC1323a implements View.OnClickListener {
        public ViewOnClickListenerC1323a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FragmentActivity activity = a.this.getActivity();
            if (activity instanceof SelfTestActivity) {
                ((SelfTestActivity) activity).d1();
            }
        }
    }

    public static a t(TopicRecord record) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("topic_record", record);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f98061a = getArguments() != null ? (TopicRecord) getArguments().getParcelable("topic_record") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.selftest_word_item, container, false);
        inflate.setOnClickListener(new ViewOnClickListenerC1323a());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView textView = (TextView) view.findViewById(R.id.selftest_word);
        TextView textView2 = (TextView) view.findViewById(R.id.accent);
        TopicRecord topicRecord = this.f98061a;
        if (topicRecord == null) {
            textView.setText("");
            textView2.setText("");
            view.setTag(null);
        } else {
            textView.setText(topicRecord.word);
            textView2.setText(this.f98061a.phonetic);
            view.setTag(this.f98061a);
        }
    }
}
