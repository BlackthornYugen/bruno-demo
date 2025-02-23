# Test via cli
```shell
bru run --env dev 
```

# Test with params
```shell
bru run \
  --csv-file-path 'data.csv' \
  --reporter-html 'report.html' \
  --reporter-json 'report.json' \
  --reporter-junit 'report.xml' \
  --env dev
```

# Make csv data

```shell
 ollama run llama3 --format json <<< '
 Give me a csv with 12 people 
 Output csv data in csv_data key in json output
 Headers shall be name, age
' | jq -r '.csv_data' | tee data.csv 
```