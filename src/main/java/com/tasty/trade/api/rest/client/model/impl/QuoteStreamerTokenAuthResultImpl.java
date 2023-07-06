package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.QuoteStreamerTokenAuthResult;

public class QuoteStreamerTokenAuthResultImpl implements QuoteStreamerTokenAuthResult {

	
	@JsonProperty("token")
	private String token;
	
	@JsonProperty("streamer-url")
	private String streamerUrl;
	
	@JsonProperty("websocket-url")
	private String websocketUrl;
	
	@JsonProperty("dxlink-url")
	private String dxlinkUrl;
	
	@JsonProperty("level")
	private String level;

	/**
	 * @return the token
	 */
	public final String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public final void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the streamerUrl
	 */
	public final String getStreamerUrl() {
		return streamerUrl;
	}

	/**
	 * @param streamerUrl the streamerUrl to set
	 */
	public final void setStreamerUrl(String streamerUrl) {
		this.streamerUrl = streamerUrl;
	}

	/**
	 * @return the websocketUrl
	 */
	public final String getWebsocketUrl() {
		return websocketUrl;
	}

	/**
	 * @param websocketUrl the websocketUrl to set
	 */
	public final void setWebsocketUrl(String websocketUrl) {
		this.websocketUrl = websocketUrl;
	}

	/**
	 * @return the dxlinkUrl
	 */
	public final String getDxlinkUrl() {
		return dxlinkUrl;
	}

	/**
	 * @param dxlinkUrl the dxlinkUrl to set
	 */
	public final void setDxlinkUrl(String dxlinkUrl) {
		this.dxlinkUrl = dxlinkUrl;
	}

	/**
	 * @return the level
	 */
	public final String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public final void setLevel(String level) {
		this.level = level;
	}
	
	
	
	
}
