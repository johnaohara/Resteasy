package org.jboss.resteasy.security.doseta;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class VerificationResult
{
   protected boolean verified;
   protected String failureReason;
   protected Exception failureException;
   protected DKIMSignature signature;

   public boolean isVerified()
   {
      return verified;
   }

   public void setVerified(boolean verified)
   {
      this.verified = verified;
   }

   public String getFailureReason()
   {
      return failureReason;
   }

   public void setFailureReason(String failureReason)
   {
      this.failureReason = failureReason;
   }

   public Exception getFailureException()
   {
      return failureException;
   }

   public void setFailureException(Exception failureException)
   {
      this.failureException = failureException;
   }

   public DKIMSignature getSignature()
   {
      return signature;
   }

   public void setSignature(DKIMSignature signature)
   {
      this.signature = signature;
   }
}