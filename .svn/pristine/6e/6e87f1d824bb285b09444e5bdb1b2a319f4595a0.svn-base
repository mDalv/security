package pe.gafs.security.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
//@PropertySource("file:${properties.externo}security.properties")
public class PropertiesConfig {

	@Value("${security.signing-key}")
	private String signingKey;

	@Value("${security.encoding-strength}")
	private String encodingStrength;

	@Value("${security.security-realm}")
	private String securityRealm;

	@Value("${security.jwt.client-id}")
	private String jwtClientId;

	@Value("${security.jwt.client-secret}")
	private String jwtClientSecret;

	@Value("${security.jwt.resource-ids}")
	private String jwtResourceIds;

	@Value("${security.jwt.grant-type}")
	private String jwtGrantType;

	@Value("${security.jwt.scope-read}")
	private String jwtScopeRead;

	@Value("${security.jwt.scope-write}")
	private String jwtScopeWrite;

	@Value("${security.jwt.token-time}")
	private int jwtTokenTime;

}
