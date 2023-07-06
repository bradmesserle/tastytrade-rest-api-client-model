package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.QuoteStreamerTokenAuthResultImpl;

@JsonTypeInfo(defaultImpl = QuoteStreamerTokenAuthResultImpl.class, use=Id.CLASS)
public interface QuoteStreamerTokenAuthResult {

	/**
	 * @return the token
	 */
	 String getToken();

	/**
	 * @param token the token to set
	 */
	 void setToken(String token);

	/**
	 * @return the streamerUrl
	 */
	 String getStreamerUrl();

	/**
	 * @param streamerUrl the streamerUrl to set
	 */
	 void setStreamerUrl(String streamerUrl);

	/**
	 * @return the websocketUrl
	 */
	 String getWebsocketUrl();

	/**
	 * @param websocketUrl the websocketUrl to set
	 */
	 void setWebsocketUrl(String websocketUrl);

	/**
	 * @return the dxlinkUrl
	 */
	 String getDxlinkUrl();

	/**
	 * @param dxlinkUrl the dxlinkUrl to set
	 */
	 void setDxlinkUrl(String dxlinkUrl);

	/**
	 * @return the level
	 */
	 String getLevel();

	/**
	 * @param level the level to set
	 */
	 void setLevel(String level);

	
}
