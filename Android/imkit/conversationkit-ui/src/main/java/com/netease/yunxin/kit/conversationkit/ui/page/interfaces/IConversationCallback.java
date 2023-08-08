// Copyright (c) 2022 NetEase, Inc. All rights reserved.
// Use of this source code is governed by a MIT license that can be
// found in the LICENSE file.

package com.netease.yunxin.kit.conversationkit.ui.page.interfaces;

/** conversation callback to observer the unread count change */
public interface IConversationCallback {

  void updateUnreadCount(int count);
}
