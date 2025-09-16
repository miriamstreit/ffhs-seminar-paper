FROM python:3.11.8-slim

WORKDIR /flask-app

COPY requirements.txt requirements.txt

RUN pip3 install -r requirements.txt
COPY app .

CMD [ "python3", "-m" , "flask", "--app=hello", "run", "--host=0.0.0.0"]