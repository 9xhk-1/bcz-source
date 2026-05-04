package hg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class u extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final String f59327b = "topic_record";

    /* renamed from: a, reason: collision with root package name */
    public TopicRecord f59328a;

    private void t(View root) {
        ((TextView) root.findViewById(R.id.word)).setText(this.f59328a.word);
        ((TextView) root.findViewById(R.id.accent)).setText(this.f59328a.phonetic);
        ((TextView) root.findViewById(R.id.cnmean)).setText(this.f59328a.wordMean);
    }

    public static u v(TopicRecord record) {
        u uVar = new u();
        Bundle bundle = new Bundle();
        bundle.putParcelable("topic_record", record);
        uVar.setArguments(bundle);
        return uVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        if (savedInstanceState != null) {
            this.f59328a = (TopicRecord) savedInstanceState.getParcelable("topic_record");
        }
        if (this.f59328a == null) {
            throw new IllegalArgumentException("topic record in ThreePartWikiFragment cannot be null.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_three_part_wiki, container, false);
        t(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("topic_record", this.f59328a);
    }
}
