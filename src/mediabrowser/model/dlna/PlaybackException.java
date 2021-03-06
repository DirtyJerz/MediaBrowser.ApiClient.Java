package mediabrowser.model.dlna;

public class PlaybackException extends RuntimeException
{
	private PlaybackErrorCode ErrorCode = PlaybackErrorCode.values()[0];
	public final PlaybackErrorCode getErrorCode()
	{
		return ErrorCode;
	}
	public final void setErrorCode(PlaybackErrorCode value)
	{
		ErrorCode = value;
	}
}