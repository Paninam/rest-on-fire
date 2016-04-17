package org.restonfire.utils;

import com.ning.http.client.AsyncHttpClient;

/**
 * Created by jfischer on 2016-04-14.
 */
public final class RequestBuilderUtil {
  private RequestBuilderUtil() {
    //do nothing
  }

  public static AsyncHttpClient.BoundRequestBuilder createGet(AsyncHttpClient asyncHttpClient, String referenceUrl) {
    return asyncHttpClient.
      prepareGet(referenceUrl);
  }

  public static AsyncHttpClient.BoundRequestBuilder createPost(AsyncHttpClient asyncHttpClient, String referenceUrl, String body) {
    return asyncHttpClient.
      preparePost(referenceUrl).
      setBody(body);
  }

  public static AsyncHttpClient.BoundRequestBuilder createPatch(AsyncHttpClient asyncHttpClient, String referenceUrl, String body) {
    return asyncHttpClient.
      preparePatch(referenceUrl).
      setBody(body);
  }

  public static AsyncHttpClient.BoundRequestBuilder createPut(AsyncHttpClient asyncHttpClient, String referenceUrl, String body) {
    return asyncHttpClient.
      preparePut(referenceUrl).
      setBody(body);
  }

  public static AsyncHttpClient.BoundRequestBuilder createDelete(AsyncHttpClient asyncHttpClient, String referenceUrl) {
    return asyncHttpClient.
      prepareDelete(referenceUrl);
  }
}