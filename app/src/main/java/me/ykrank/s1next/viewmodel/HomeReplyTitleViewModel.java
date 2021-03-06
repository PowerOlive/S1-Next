package me.ykrank.s1next.viewmodel;

import androidx.databinding.ObservableField;
import android.net.Uri;
import android.view.View;

import me.ykrank.s1next.data.api.model.HomeThread;
import me.ykrank.s1next.view.activity.PostListGatewayActivity;

/**
 * Created by ykrank on 2017/2/4.
 */

public final class HomeReplyTitleViewModel {
    public final ObservableField<HomeThread> thread = new ObservableField<>();

    public final void onClick(View v) {
        PostListGatewayActivity.Companion.start(v.getContext(), Uri.parse(thread.get().getUrl()));
    }
}
