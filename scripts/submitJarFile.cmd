spark-submit \
  --class "SimpleApp" \
  # reffers to master uri
  --master %1 \
  --deploy-mode client \
  --executor-memory 1g \
  --executor-cores 2 \
  #reffers to app jar path
   %2