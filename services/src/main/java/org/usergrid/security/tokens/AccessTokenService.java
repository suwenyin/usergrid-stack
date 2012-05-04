package org.usergrid.security.tokens;

import java.util.Map;

import org.usergrid.security.AccessTokenInfo;
import org.usergrid.security.AccessTokenType;
import org.usergrid.security.AuthPrincipalInfo;

public interface AccessTokenService {

	public String createAccessToken(AccessTokenType tokenType, String type,
			Map<String, Object> state) throws Exception;

	public String createAccessToken(AuthPrincipalInfo principal)
			throws Exception;

	public String createAccessToken(AuthPrincipalInfo principal,
			Map<String, Object> state) throws Exception;

	public String createAccessToken(AccessTokenType tokenType, String type,
			AuthPrincipalInfo principal, Map<String, Object> state)
			throws Exception;

	public AccessTokenInfo getAccessTokenInfo(String token) throws Exception;

	public String refreshAccessToken(String token) throws Exception;

}
