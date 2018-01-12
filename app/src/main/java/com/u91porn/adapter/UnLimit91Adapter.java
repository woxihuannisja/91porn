package com.u91porn.adapter;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.format.Formatter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.liulishuo.filedownloader.FileDownloader;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.u91porn.R;
import com.u91porn.data.model.UnLimit91PornItem;

import java.util.List;

/**
 * @author flymegoc
 * @date 2017/11/14
 */

public class UnLimit91Adapter extends BaseQuickAdapter<UnLimit91PornItem, BaseViewHolder> {

    public UnLimit91Adapter(int layoutResId, @Nullable List<UnLimit91PornItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, UnLimit91PornItem item) {
        helper.setText(R.id.tv_91porn_item_title, item.getTitleWithDuration());
        helper.setText(R.id.tv_91porn_item_info, item.getInfo());
        SimpleDraweeView simpleDraweeView = helper.getView(R.id.iv_91porn_item_img);
        Uri uri = Uri.parse(item.getImgUrl());
        simpleDraweeView.setImageURI(uri);
    }
}
